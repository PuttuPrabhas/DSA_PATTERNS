class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        int count = 0;
        long small = Integer.MAX_VALUE;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                int val = Math.abs(matrix[i][j]);
                sum+=Math.abs(matrix[i][j]);
                if(matrix[i][j] < 0){
                    count++;
                }
                if(val < small){
                    small = val;
                }
            }
        }
        if(count %2 == 0){
            return sum;
        }
        return sum-small-small;
        
    }
}