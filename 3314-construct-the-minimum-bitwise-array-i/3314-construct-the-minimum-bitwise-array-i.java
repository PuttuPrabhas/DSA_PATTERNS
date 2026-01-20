class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans = new int[nums.size()];
        for(int i = 0; i < nums.size(); i++){
            boolean flag = false;
            for(int j = 1; j <= nums.get(i); j++){
                int temp = j|j+1;
                if(temp == nums.get(i)){
                    ans[i] = j;
                    flag = true;
                    break;
                }
            }
            if(!flag){
                ans[i] = -1;
            }
        }
        return ans;
        
    }
}