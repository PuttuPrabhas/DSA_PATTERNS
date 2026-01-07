class Solution {
    public int DP (String one, String two, int ind1, int ind2, int[][] dp){
        if(ind1 == -1 || ind2 == -1){
            return 0;
        }
        if(dp[ind1][ind2]!=-1){
            return dp[ind1][ind2];
        }
        if(one.charAt(ind1) == two.charAt(ind2)){
            return dp[ind1][ind2]=1+DP(one,two,ind1-1,ind2-1,dp);
        }
        return dp[ind1][ind2]= Math.max(DP(one ,two,ind1,ind2-1,dp),DP(one,two,ind1-1,ind2,dp));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] dp  = new int[n][m];
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }
        int ans = DP(text1,text2,n-1,m-1,dp);
        return ans;
        
    }
}