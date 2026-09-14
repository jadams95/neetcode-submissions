class Solution {

    private int[][] DIRS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int maxAreaOfIsland(int[][] grid) {
        int ROW = grid.length;
        int COL = grid[0].length;
        int maxAreaOfIsland = 0;
        for(int i = 0; i < ROW; i++){
            for(int y = 0; y < COL; y++){
                if(grid[i][y] == 1){
                    maxAreaOfIsland = max(maxAreaOfIsland, dfs(grid, i, y));
                    // maxAreaOfIsland++;
                }
            }
        }
        return maxAreaOfIsland;
    }

    private int dfs(int[][] grid, int r, int c){
        int ROW = grid.length;
        int COL = grid[0].length;
        if(r < 0 || c < 0 || r >= ROW || c >= COL || grid[r][c] == 0){
            return 0;
        }
        grid[r][c] = 0;
        int res = 1;
        for(int[] dir : DIRS){
            res += dfs(grid, r + dir[0], c + dir[1]);
        }
        return res;
    }

    public int max(int a, int b){
        return (a >= b) ? a : b;
    }


}
