class Solution {
    /**
     * @param {character[][]} board
     * @return {void} Do not return anything, modify board in-place instead.
     */
    solve(board) {
        // let setOfConnectedSegments = new Map();

        let ROWS = board.length, COLS = board[0].length;

        let directions = [[1, 0], [-1, 0], [0, 1], [0, -1]];

        // Phases Capture the unsurrounded region Keys O -> T
        const capture = () => {
            let q = new Queue();
            for(let r = 0; r < ROWS; r++){
                for(let c = 0; c < COLS; c++){
                    if(r === 0 || 
                    r === ROWS - 1 ||
                    c === 0 || c === COLS - 1 && 
                    board[r][c] === 'O'){
                        q.push([r, c]);
                    }
                }
            }
            while(!q.isEmpty()){
                let [r, c] = q.pop();
                if(board[r][c] === 'O'){
                    board[r][c] = 'T';
                    for(let [dr, dc] of directions){
                        let nr = r + dr, nc = c + dc;
                        if(nr >= 0 && nr < ROWS && nc >= 0 && nc < COLS){
                            q.push([nr, nc]);
                        }
                    }
                }
            }
        }
        capture();
        for(let r = 0; r < ROWS; r++){
            for(let c = 0; c < COLS; c++){
                if(board[r][c] === 'O') board[r][c] = 'X';
                else if(board[r][c] === 'T') board[r][c] = 'O';
            }
        }
        // 2. Capture surrounded regions O -> X

        // 3. Uncapture unsurround regions (T -> O)
        
        // 1,1 -> [(1,1), [(1,2), (2, 1), (2, 2)]
        
        // 1, 2 -> [(1,2), (2,1), (2,2)]

        // for(let rows = 0; rows < board.length; rows++){
        //     for(let cols = 0; cols < board[0].length; cols++){
        //         // if we get the end of row if the top row and bottom row are 'x' or if 'o' is unconnected
        //         // once we find an O and its somewhere in the middle check the neighbors
        //         // if it's not a top or bottom row 
        //         // board[row][col] = 'X'
                
        //     }
        // }


        // board[x][y] = 'X';
        // Queue to change the 'O' to 'X'

        // return board;
    }
}
