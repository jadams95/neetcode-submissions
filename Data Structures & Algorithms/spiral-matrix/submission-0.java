class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int y = matrix.length;
        int x = matrix[0].length;
        
        List<Integer> resList = new ArrayList<Integer>(y * x);


        // for(int i = 0; i < resList.length; i++){
        //     resList[i] = new ArrayList<Integer>();
        // }

        // for(int i = 0; i < y; i++){
        //     for(int u = 0; u < x; u++){
        //         resList.add(matrix[i][u]);
        //     }
        // }

      // Define boundaries
        int top = 0;
        int bottom = y - 1;
        int left = 0;
        int right = x - 1;
        
        while (top <= bottom && left <= right) {
            // T1: Move RIGHT along the top row
            for (int col = left; col <= right; col++) {
                resList.add(matrix[top][col]);
            }
            top++; // Shrink top boundary
            
            // T2: Move DOWN along the right column
            for (int row = top; row <= bottom; row++) {
                resList.add(matrix[row][right]);
            }
            right--; // Shrink right boundary
            
            // T3: Move LEFT along the bottom row (if there's still a row)
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    resList.add(matrix[bottom][col]);
                }
                bottom--; // Shrink bottom boundary
            }
            
            // T4: Move UP along the left column (if there's still a column)
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    resList.add(matrix[row][left]);
                }
                left++; // Shrink left boundary
            }
        }

        // Do we want to do a Map we have to do a lot of transformations
        // HashMap<Integer, int[][]> test = new HashMap<>();

        return resList;
    }

    // public int[][] transform(List<int[][]> resList){
    //     return resList[0][0];
    // }
}
