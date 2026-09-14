class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> subStringMap = new HashMap<>();
        int l = 0, res = 0;
        for(int i = 0; i < s.length(); i++){
            if(subStringMap.containsKey(s.charAt(i))){
                  l =  max(subStringMap.get(s.charAt(i)) + 1, l);
            }
            subStringMap.put(s.charAt(i), i);
            res = max(res, i - l + 1);
        }
        return res;
    }


    public int max(int a, int b){
        return (a >= b) ? a : b;
    }
}
