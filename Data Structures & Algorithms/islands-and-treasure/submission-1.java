class Solution {
        private int[][] directions = {{1, 0}, {-1, 0}, 
                                  {0, 1}, {0, -1}};
    private int INF = 2147483647;
    private int ROWS, COLS;
    public void islandsAndTreasure(int[][] grid) {
        ROWS = grid.length;
        COLS = grid[0].length;

        for(int x = 0; x < ROWS; x++){
            for(int y = 0; y < COLS; y++){
                if(grid[x][y] ==INF){
                    grid[x][y] = bfs(grid,x, y);
                }
            }
        }
    }
    public int bfs(int[][]grid, int r, int c){
        
        Queue<int[]> que = new LinkedList<>();
        
        que.add(new int[]{r, c});
        
        boolean[][] visit = new boolean[ROWS][COLS];

        visit[r][c] = true;
        int steps = 0;
        
        while(!que.isEmpty()){
            int size = que.size();
            for(int i = 0; i < size; i++){
                int[] curr = que.poll();
                // we form the row and col for each array we poll for curr[0] for row, curr[1] for col
                int row = curr[0], col = curr[1];
                if(grid[row][col] == 0) return steps;
                for(int[] dir:directions){
                    int nr = row + dir[0], nc = col + dir[1];
                    if(nr >= 0 
                    && nr < ROWS && nc >= 0 
                    && nc < COLS 
                    && !visit[nr][nc] && grid[nr][nc] != -1){
                            visit[nr][nc] = true;
                            que.add(new int[]{nr, nc});
                    }
                }
            }
            steps++;
        }
        return INF;
    }
}
