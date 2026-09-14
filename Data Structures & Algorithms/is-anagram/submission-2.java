class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> freqCountS = new HashMap<Character, Integer>();
        HashMap<Character, Integer> freqCountT = new HashMap<Character, Integer>();


        for(int i = 0; i < s.length(); i++){
            freqCountS.put(s.charAt(i), freqCountS.getOrDefault(s.charAt(i), 0) + 1);
            freqCountT.put(t.charAt(i), freqCountT.getOrDefault(t.charAt(i), 0) + 1);
        }
        return freqCountS.equals(freqCountT);
    }
}
