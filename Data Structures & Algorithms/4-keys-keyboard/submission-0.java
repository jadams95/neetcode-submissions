class Solution {
    public int maxA(int n) {
    // Imagine you have a special keyboard with the following keys:
    // A: Print one 'A' on the screen.
    // Ctrl-A: Select the whole screen.
    // Ctrl-C: Copy selection to buffer.
    // Ctrl-V: Print buffer on screen appending it after what has already been printed.
    
    // SRTBOT
    // 
    // int counter == n
    // int result = 0
        int[] dp = new int[n + 1];

        // option for pressing 'A'
        for(int i = 1; i <= n; i++){
            dp[i] = dp[i - 1] + 1;

            for(int b = 0; b <= i - 3; b++){
                dp[i] = Math.max(dp[i], dp[b] * (i - b - 1));
            }
        }
        return dp[n];
    }
}
