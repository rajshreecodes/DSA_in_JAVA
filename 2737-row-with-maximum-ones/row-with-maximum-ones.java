class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int maxOnes = 0;
        int rowIndex = 0;
        for(int i=0;i<row;i++){
            int count = 0;
            for(int j=0;j<col;j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }
            if(count > maxOnes){
                maxOnes = count;
                rowIndex = i;
            }
        }
        return new int[]{rowIndex,maxOnes};
    }
}