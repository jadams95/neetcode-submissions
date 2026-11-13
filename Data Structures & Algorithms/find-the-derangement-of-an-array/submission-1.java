class Solution {
    public int findDerangement(int n) {
        final long MOD = 1_000_000_007L;
        if(n == 0) return 1;
        if(n == 1) return 0;

        long prev2 = 1;
        long prev1 = 0;

        for(int i = 2; i <= n; i++){
           long curr = (i - 1) * ((prev1 + prev2) % MOD) % MOD;
           prev2 = prev1;
           prev1 = curr;
        }

        return (int) prev1;
    }
}
