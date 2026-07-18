class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int row = grid.length;
        int col = grid[0].length;
        int total = row * col;

        k = k % total;

        int[][] newGrid = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                int currentIndex = i * col + j;
                int newIndex = (currentIndex + k) % total;

                int newRow = newIndex / col;
                int newCol = newIndex % col;

                newGrid[newRow][newCol] = grid[i][j];
            }
        }

       List<List<Integer>> ans = new ArrayList<>();
         for (int i = 0; i < row; i++) {

            List<Integer> temp = new ArrayList<>();

               for (int j = 0; j < col; j++) {
                    temp.add(newGrid[i][j]);
                }  
        ans.add(temp);
            }
    return ans;
    }
}