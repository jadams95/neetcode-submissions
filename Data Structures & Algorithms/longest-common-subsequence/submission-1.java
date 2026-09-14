class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int frstStrLen = text1.length();
        int scdStrLen = text2.length();

        int[][] dp = new int[frstStrLen + 1][scdStrLen + 1];

        for(int r = text1.length() - 1; r >= 0; r--){
            for(int c = text2.length() - 1; c >= 0; c--){
                if(text1.charAt(r) == text2.charAt(c)){
                    dp[r][c] = 1 + dp[r + 1][c + 1];
                } else {
                    dp[r][c] = Math.max(dp[r][c + 1], dp[r + 1][c]);
                }
            }
        }
        return dp[0][0];
    }
}
