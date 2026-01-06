class Solution {
    public void BackTrack(int index, int[] nums, List<List<Integer>> ans, List<Integer> temp,int target){
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(target < 0 || index == nums.length){
            return;
        }
        temp.add(nums[index]);
        BackTrack(index+1,nums,ans,temp,target-nums[index]);
        temp.remove(temp.size()-1);
        for(int i = index+1; i < nums.length; i++){
            if(nums[i]!=nums[index]){
                BackTrack(i,nums,ans,temp,target);
                break;
            }
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans  = new ArrayList<>();
        BackTrack(0,candidates,ans,new ArrayList<>(), target);
        return ans;
        
    }
}