class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long total = 0;
        int n = grid.length;
        int m = grid[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                total+=grid[i][j];
            }
        }
        long horizontal = 0;
        long htotal = total;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                horizontal+=grid[i][j];
                htotal-=grid[i][j];
                if(horizontal == htotal && j == m-1) return true;
                if(horizontal > htotal) break;
            }
        }
        long vertical = 0;
        long vtotal = total;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                vertical+=grid[j][i];
                vtotal-=grid[j][i];
                if(vertical == vtotal && j == n-1) return true;
                if(vertical > vtotal) break;
            }
        }
        return false;
        
    }
}