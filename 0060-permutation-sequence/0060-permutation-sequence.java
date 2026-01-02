class Solution {
    public void BackTrack(int n , int[] k, boolean[] used,List<String>ans, StringBuilder temp){
        if(ans.size()!=0){
            return;
        }
        if(temp.length() == n){
            k[0]--;
            if(k[0] == 0){
                ans.add(temp.toString());
               
            }
            
            return;
        }
        for(int i = 1; i <= n; i++){
            if(used[i-1]) continue;
            used[i-1]=true;
            temp.append(i);
            BackTrack(n,k,used,ans,temp);
            temp.deleteCharAt(temp.length() - 1);
            used[i-1] = false;

        }
    }
    public String getPermutation(int n, int k) {
        List<String> ans = new ArrayList<>();
        boolean[] used = new boolean[n];
         
        BackTrack(n,new int[]{k},used,ans,new StringBuilder());
        
        
        return ans.get(0);
        
    }

}