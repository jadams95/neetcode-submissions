class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROW = matrix.length;
        int COL = matrix[0].length;
        for(int i = 0; i < ROW; i++){
            for(int y = 0; y < COL; y++){
                if(dfsMatrix(matrix, target, i, y, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfsMatrix(int[][] matrix, int target, int r, int c, int index){
        int ROW = matrix.length;
        int COL = matrix[0].length;
        if(r < 0 || c < 0 || r >= ROW || c >= COL || matrix[r][c] != target){
            return false;
        }
        return (matrix[r][c] == target) || dfsMatrix(matrix, target, r, c, index);
    }
}
