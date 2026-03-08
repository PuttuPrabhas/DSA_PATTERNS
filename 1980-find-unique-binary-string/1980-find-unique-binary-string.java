class Solution {
    public void generate(List<String> ans, StringBuilder sb,int n){
        if(sb.length() == n){
            ans.add(new String(sb));
            return;
        }
        generate(ans,sb.append('0'),n);
        sb.deleteCharAt(sb.length()-1);
        generate(ans,sb.append('1'),n);
        sb.deleteCharAt(sb.length()-1);
    }

    public String findDifferentBinaryString(String[] nums) {
        List<String> ans = new ArrayList<>();
        generate(ans,new StringBuilder() ,nums.length);
        Collections.sort(ans);
        Arrays.sort(nums);
       
        for(int i = 0; i < nums.length; i++){
            if(!nums[i].equals(ans.get(i))){
                return ans.get(i);
            }
        }
        return ans.get(nums.length);
        
    }
}