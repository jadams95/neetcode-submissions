class Solution {
    int ROWS, COLS;
    boolean pacific, atlantic;
    int[][] directions = {{1,0}, {-1, 0}, {0, 1}, {0, -1}};




    public List<List<Integer>> pacificAtlantic(int[][] heights) {
            ROWS = heights.length;
            COLS = heights[0].length;
            List<List<Integer>> res = new ArrayList<>();

            for(int i = 0; i < ROWS; i++){
                for(int y = 0; y < COLS; y++){
                    pacific = false;
                    atlantic = false;
                    dfs(heights, i, y, Integer.MAX_VALUE);
                    if(pacific && atlantic){
                        res.add(Arrays.asList(i, y));
                    }
                }
            }
            return res;
    }
    public void dfs(int[][] heights, int r, int c, int prevVal){
        if(r < 0 || c < 0){
            pacific = true;
            return;
        }
        
        if(r >= ROWS || c >= COLS){
            atlantic = true;
            return;
        }

        if(heights[r][c] > prevVal){
            return;
        }

        int tmp = heights[r][c];
        heights[r][c] = Integer.MAX_VALUE;
        // 2. if(it is water and a stream of water touches 
        // the pacific or an adjacent square then add the grid[r][c] which is the 0 index of the col)
        // and the ends of the bottom row and last index

        for(int[] dir : directions){
            dfs(heights, r + dir[0], c + dir[1], tmp);
            if(pacific && atlantic){
                break;
            }
        }
        heights[r][c] = tmp;
    }

    public int max(int a, int b){
        return (a >= b) ? a : b;
    }
}
