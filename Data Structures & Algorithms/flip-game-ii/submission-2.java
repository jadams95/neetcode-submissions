class Solution {
    public boolean canWin(String currentState) {
        int[] g = new int[21];
        for(int n = 2; n <= 20; n++){
            Set<Integer> seen = new HashSet<>();
            for(int left = 0; left < n - 1; left++) seen.add(g[left] ^ g[n - left - 2]);
            while(seen.contains(g[n])) g[n]++;
        }
        int value = 0, run = 0;

       for(char c:(currentState + "-").toCharArray()){
        if(c == '+') run++;
        else {
            value ^= g[run];
            run = 0;
        }
       }
       return value != 0;
    }
}
