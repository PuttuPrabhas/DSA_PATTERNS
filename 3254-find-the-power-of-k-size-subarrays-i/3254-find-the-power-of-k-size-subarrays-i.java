class Solution {
    public int[] resultsArray(int[] nums, int k) {
        if(k == 1){
            return nums;
        }
        int[] res = new int[nums.length-k+1];
        int index = 0;
        int left = 0;
        int right = 0;
        while(left < nums.length-k){
            if(right > 0 && nums[right]!=nums[right-1]+1){
                while(left < right && left < nums.length-k){
                    res[index++] = -1;
                    left++;
                }
                
            }
            else if(right > 0 && nums[right] == nums[right-1]+1 && (right - left)+1 == k){
                res[index++] = nums[right];
                left++;
                

            }
            right++;
        }
        for(int i = nums.length-k; i< nums.length-1; i++){
            if(nums[i] != nums[i+1]-1){
                res[index++] = -1;
                return res;
            }
        }
        res[index] = nums[nums.length-1];
        return res;

    }
}