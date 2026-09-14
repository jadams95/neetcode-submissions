// class Solution {

//     private static int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    
    
//     public void setZeroes(int[][] matrix) {
//         int row = matrix.length;
//         int col = matrix[0].length;
        

//         for(int x = 0; x < row; x++){
//             for(int y = 0; y < col; y++){
//                 if(){
//                 // condition exists then run and update using adjacencyUpdate Method
//                 adjacencyUpdate(0, matrix);    
//                 }
//             }
//         }
        
//     }

//     private void adjacencyUpdate(int index, int[][] matrix, ){
//         matrix[row][col] = 0;
//     }
// }
public class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        boolean[] rowZero = new boolean[rows];
        boolean[] colZero = new boolean[cols];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (matrix[r][c] == 0) {
                    rowZero[r] = true;
                    colZero[c] = true;
                }
            }
        }

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (rowZero[r] || colZero[c]) {
                    matrix[r][c] = 0;
                }
            }
        }
    }
}