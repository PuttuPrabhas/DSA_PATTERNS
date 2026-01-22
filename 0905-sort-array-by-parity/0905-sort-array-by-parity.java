class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        int pos = 0;
        int neg = nums.length-1;
        for(int i : nums){
            if(i%2==0){
                ans[pos++] = i;
            }
            else{
                ans[neg--] = i;
            }
        }
        return ans;

        
    }
}