class Solution {
    public int countBinarySubstrings(String s) {
        List<Integer> ans = new ArrayList<>();
        int count = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                ans.add(count);
                count = 1;
            }
            else{
                count++;
            }
        }
        ans.add(count);
        int res = 0;
        for(int i = 1; i < ans.size(); i++){
            res+=Math.min(ans.get(i),ans.get(i-1));
        }
        return res;
    }
}