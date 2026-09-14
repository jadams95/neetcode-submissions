class Solution {
     public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int l = 0, res = 0;
        
        for (int r = 0; r < s.length(); r++) {
            if (mp.containsKey(s.charAt(r))) {
                // this is pretty much the same as the sort strings 
                l = max(mp.get(s.charAt(r)) + 1, l);
            }
            mp.put(s.charAt(r), r);
            res = max(res, r - l + 1);
        }
        return res;
    }

    public int max(int a, int b){
        return (a >=  b) ? a : b;
    }
    
}
