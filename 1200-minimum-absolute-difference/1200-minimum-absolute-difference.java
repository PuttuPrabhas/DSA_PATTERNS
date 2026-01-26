class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int mini = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length-1; i++){
            mini = Math.min(mini,nums[i+1]-nums[i]);
        }
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i+1] - nums[i] == mini){
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[i]);
                temp.add(nums[i+1]);
                ans.add(new ArrayList<>(temp));
            }
        }
        return ans;
        
    }
}