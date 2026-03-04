class Solution {
    public boolean isTrue(int[][] mat, int n, int m){
        for(int i = 0; i < mat[0].length; i++){
            if(mat[n][i] == 1 && i != m){
                return false;
            }
        }
        for(int i = 0; i < mat.length; i++){
            if(mat[i][m] == 1 && i != n){
                return false;
            }
        }
        return true;
    }
    public int numSpecial(int[][] mat) {
        int count = 0;
        int n = mat.length;
        int m = mat[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(mat[i][j] == 1){
                    if (isTrue(mat,i,j)){
                        count++;
                    }
                }
            }
        }
        return count;
        
    }
}