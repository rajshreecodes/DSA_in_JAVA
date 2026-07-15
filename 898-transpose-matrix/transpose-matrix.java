class Solution {
    public int[][] transpose(int[][] matrix) {
        
        int totalRow = matrix.length;
        int totalCol = matrix[0].length;
        //New Array
        int newTotalRow = totalCol;
        int newTotalCol = totalRow;
        int ans[][] = new int[newTotalRow][newTotalCol];
        //Actual Logic
        for(int i=0;i<totalRow;i++){
            for(int j=0;j<totalCol;j++){
                 ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}