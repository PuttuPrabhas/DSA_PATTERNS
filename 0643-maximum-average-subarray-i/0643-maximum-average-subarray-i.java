class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxi = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum+=nums[i];
        }
        double res = (double)sum/k;
        maxi = Math.max(maxi,res);
        int j = 0;
        for(int i = k; i < nums.length; i++){
            sum-=nums[j++];
            sum+=nums[i];
            res = (double)sum/k;
            if(res > maxi){
                maxi = res;
            }
        }
        return maxi;
        
    }
}