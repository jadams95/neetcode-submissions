class Solution {
     // use the directions to control the directions of   
     private static final int[][] directions = {{1, 0}, {-1, 0}, 
                                               {0, 1}, {0, -1}};



    public int numIslands(char[][] grid) {
        int ROW = grid.length;
        int COL = grid[0].length;
        int countOfisland = 0;
        // int countOfWater = 0;

        // connected 1's adjacent 1
        // it is an island if the 1 are connected horizontally or vertifical

        for(int i = 0; i < ROW; i++){
            for(int y = 0; y < COL; y++){
                if(grid[i][y] == '1'){
                    dfs(grid, i, y);
                    countOfisland++;
                }
                
            }
        }
        return countOfisland;
    }


    public void dfs(char[][] grid,int r, int c){
        int ROW = grid.length;
        int COL = grid[0].length;
        // if the land is connected for each connected 1's then increase countOfIsland by 1;
        if(r < 0 || c < 0 || r >= ROW || c >= COL || grid[r][c] == '0'){
            return;
        }
        grid[r][c] = '0';
        for(int[] dir: directions){
             dfs(grid, r + dir[0], c + dir[1]);
        }
       
    }
}
