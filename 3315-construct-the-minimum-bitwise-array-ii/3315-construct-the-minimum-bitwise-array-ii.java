class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans = new int[nums.size()];
        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i)%2==0){
                ans[i] = -1;
                continue;
            }
            String s = Integer.toBinaryString(nums.get(i));
            boolean flag = true;
            char[] c = s.toCharArray();
            for(int j = c.length-2; j >= 0; j--){
                if(c[j] == '0'){
                    c[j+1] = '0';
                    flag = false;
                    break;
                }
            }
            String res = new String(c);
            if(flag){
                res = res.substring(0,res.length()-1);
            }
            ans[i] = Integer.parseInt(res,2);
        }
        return ans;

    }
}