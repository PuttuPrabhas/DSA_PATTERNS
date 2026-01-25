class Solution {
    public int minimumDifference(int[] nums, int k) {
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;
        Arrays.sort(nums);
        int j = 0;
        for(int i = k-1; i < nums.length; i++){
            maxi = nums[i];
            mini = nums[j++];
            ans = Math.min(ans,maxi-mini);

        }
        return ans;

    }
}