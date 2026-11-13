class Solution {
    public int findDerangement(int n) {
        final long MOD = 1_000_000_007L;
        long[] dp = new long[n + 1];
        dp[0] = 1;
        dp[1] = 0;
        for (int i = 2; i <= n; i++) {
            dp[i] = (i - 1) * ((dp[i - 1] + dp[i - 2]) % MOD) % MOD;
        }
        return (int) dp[n];
    }
}
