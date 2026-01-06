class Solution {
    public void BackTrack(int index, int[] nums, List<List<Integer>> ans, List<Integer> temp, int target){
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(target < 0 || index == nums.length){
            return;
        }
        temp.add(nums[index]);
        BackTrack(index,nums,ans,temp,target-nums[index]);
        temp.remove(temp.size()-1);
        BackTrack(index+1,nums,ans,temp,target);
        
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        BackTrack(0,nums,ans,new ArrayList<>(),target);
        return ans;
        
    }
}