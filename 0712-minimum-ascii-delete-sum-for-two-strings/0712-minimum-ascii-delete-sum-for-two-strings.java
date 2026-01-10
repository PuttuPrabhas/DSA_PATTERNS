class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int dp[][] = new int[s1.length()+1][s2.length()+1];
        for(int i=1; i<=s1.length(); i++){
            for(int j=1; j<=s2.length(); j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = s1.charAt(i-1) + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
                }
            }
        }
        int total = 0;
        for(int i=0; i<s1.length(); i++){
            total += s1.charAt(i);
        }
        for(int j=0; j<s2.length(); j++){
            total += s2.charAt(j);
        }

        return total - 2 * dp[s1.length()][s2.length()];
    }
}