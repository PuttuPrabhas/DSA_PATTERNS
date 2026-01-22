class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 2){
            return nums.length;
        }
        int slow = 2;
        int fast = 2;
        while(fast < nums.length){
            if(nums[fast] == nums[slow-2]){
                fast++;
            }
            else{
                nums[slow++] = nums[fast++];
            }

        }
        return slow;
        
    }
}