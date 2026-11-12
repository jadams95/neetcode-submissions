class Solution {
    public int minimumCost(String sentence, int k) {
        // use every word exactly once Set
        // split the words of sentence into rows of at most k characters
        // int l = 0; r= sentence.length;
        // wrong topological ordering 
        String[] wrds = sentence.trim().split("\\s+");
        int n = wrds.length;
        int intINF = Integer.MAX_VALUE;
        int[] dp = new int[n + 1];
        dp[n] = 0;

        for(int i = n - 1; i >= 0; i--){
            dp[i] = intINF;
            int len = -1;

            for(int j = i; j < n; j++){
                len += wrds[j].length() + 1;
                if(len > k) break;
                if(dp[j + 1] == intINF) continue;
                int bad = (j == n - 1) ? 0 : (k - len) * (k - len);
                dp[i] = Math.min(dp[i], bad + dp[j + 1]);
            }
        }

        // HashSet<String> seenWrds = new HashSet<>();
        // SRTBOT
        // Sub-Problem:
        // relation: a row containing length characters has cost (k - length) ^ 2
        // Topological Sort:
        // Base:
        // Original Problem:
        // Time complexity O(n)

        // int cost = 0;

        // while(l <= r){
        //     int j = 0;
        //     while(sentence.charAt(j) != ' ') j++;
        //     char[] charArr = sentence.substring(i, j).toCharArray();
        // }
        
        return dp[0];
    }
}
