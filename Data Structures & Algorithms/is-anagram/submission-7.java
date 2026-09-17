class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> freqTableS = new HashMap<Character, Integer>();
        HashMap<Character, Integer> freqTableT = new HashMap<Character, Integer>();

        for(int i = 0; i < s.length(); i++){
        freqTableS.put(s.charAt(i), freqTableS.getOrDefault(s.charAt(i), 0) +       1);
        freqTableT.put(t.charAt(i), freqTableT.getOrDefault(t.charAt(i), 0) + 1);
        }

        return freqTableS.equals(freqTableT);


    }
}
