class Solution {
    public int minPairSum(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            maxi = Math.max(maxi,nums[left++]+nums[right--]);
        }
        return maxi;
        
    }
}