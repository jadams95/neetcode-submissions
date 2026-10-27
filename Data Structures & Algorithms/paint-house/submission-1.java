class Solution {
        // red, blue, or green 
        // n x 3
        // cost matrix
        // minimum cost spanning tree
        // 

        // private int[][] costs;
        // private int n = costs.length;

        public int minCost(int[][] costs){
            int n = costs.length;
            if(n == 0) return 0;

            int[][] dp = new int[n][3];


            // int res = Integer.MAX_VALUE;

            for(int c = 0; c < 3; c++){
                dp[0][c] = costs[0][c];
            }




            for(int i = 1; i < n; i++){
                for(int c = 0; c < 3; c++){
                    dp[i][c] = costs[i][c] + Math.min(dp[i - 1][(c + 1) % 3], dp[i - 1][(c + 2) % 3]);
                }    
            }
            return Math.min(dp[n - 1][0], Math.min(dp[n - 1][1], dp[n - 1][2]));
        }
}