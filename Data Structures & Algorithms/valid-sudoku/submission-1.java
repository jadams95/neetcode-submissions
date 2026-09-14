class Solution {
    public boolean isValidSudoku(char[][] board) {
        // three rules for the columns must have a unique 1-9 digit
        // 1. sub matrix
        // 2. rows
        // 3. columns 


        // Solution should have a Integer, and a set of characters - 1 First Miss I had the board represented in matrix 
    

        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();


        


        // Right Idea with the column sizes for the sub matrix but these should be inside the nested for loops to check the rows
        int gridLength = board.length / 3;
        int columnLength = board[0].length / 3;

        System.out.println(gridLength + columnLength);
        
        // these would allow search each subgrid by a pointer then looking 3 location further to check the subgrids 
        // needed to figure out how to check each grid

        for(int i = 0; i < 9; i++){
            for(int y = 0; y < 9; y++){
                if(board[i][y] == '.') continue;
                String squareKey = (i / 3) + "," + (y / 3);

                if(rows.computeIfAbsent(i, k -> new HashSet<>()).contains(board[i][y])
                    || cols.computeIfAbsent(y, k -> new HashSet<>()).contains(board[i][y]) ||
                    squares.computeIfAbsent(squareKey, k -> new HashSet<>()).contains(board[i][y])
                ){
                    return false;
                }

                // This was located outside but needs to be located in the hashset

                // if(checkValidSquare(board[i][y]) && checkValidSquare(board[i + 3][y + 3]) && board[i + 6][y + 6]; 
                //     // three rules for unique number
                // ){
                //     return true;
                // }
                // return false;

                rows.get(i).add(board[i][y]);
                cols.get(y).add(board[i][y]);
                squares.get(squareKey).add(board[i][y]);
            }
        }
        return true;
    }
}