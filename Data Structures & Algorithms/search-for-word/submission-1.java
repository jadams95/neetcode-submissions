class Solution {
//  set the static variables for ROWS and COLS
    private int ROWS, COLS;


    public boolean exist(char[][] board, String word) {
        // declare the static variables
        ROWS = board.length;
        COLS = board[0].length;    

        // int window = word.length();

        // could use the HashMap
        // HashMap<Character, Position> hashMap = new HashMap<>();
        // int l = 0, r = 1;

        // Position text = null;

        //  Brute force approach was correct, but better to set the constraints for the matrix 
        for(int i = 0; i < ROWS; i++){
            for(int y = 0; y < COLS; y++){
                    //  find the middle of the word and the end sequence
                    // only need one dfs method that contains the five requirements  
                    if(dfs(board, word, i, y, 0)){
                        return true;
                    }
            }
        }
        // hashMap
        return false;
    }

    private boolean dfs(char[][] board, String word, int r, int c, int i){
                if(i == word.length()){
                    return true;
                }
                if(r < 0 || c < 0 || r >= ROWS || c >= COLS || board[r][c] != word.charAt(i) || board[r][c] == '#'){
                    return false;
                }

                board[r][c] = '#';
                boolean result = dfs(board, word, r + 1, c, i + 1) ||
                                 dfs(board, word, r - 1, c, i + 1) ||
                                 dfs(board, word, r, c + 1, i + 1) ||
                                 dfs(board, word, r, c - 1, i + 1);
                
                board[r][c] = word.charAt(i);
                // condition to check if it's in row example 1 can't be in row because we know that there is one space left
                    // else if (board[i][y] == word.charAt(l)){
                    //     text = new Position(i, y);
                    //     hashMap.put(word.charAt(l), text);
                    // }
                // second condition is to check the connected row below or above  
                // if it's the middle row check the row above and below
                    // if(board[i][y] == word.charAt)

                    // if(hashMap.containsKey(word.charAt(l)) && hashMap.get(0) adjacent square){
                    //     l++;
                    // }
                    // return true; 
                return result;
    }
}