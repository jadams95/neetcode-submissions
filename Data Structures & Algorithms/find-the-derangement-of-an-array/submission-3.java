class Solution {
    public int findDerangement(int n) {
        final long MOD = 1_000_000_007L;
        long d = 1; // D(0)
        for (int i = 1; i <= n; i++) {
            d = (i * d + (i % 2 == 0 ? 1 : -1) + MOD) % MOD;
        }
        return (int) d;
    }
}
