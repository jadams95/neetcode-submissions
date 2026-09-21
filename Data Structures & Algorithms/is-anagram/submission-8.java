class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> freqTblS = new HashMap<Character, Integer>();
                HashMap<Character, Integer> freqTblT = new HashMap<Character, Integer>();

    for(int i = 0; i < s.length(); i++){
        freqTblS.put(s.charAt(i), freqTblS.getOrDefault(s.charAt(i), 0) + 1);
        freqTblT.put(t.charAt(i), freqTblT.getOrDefault(t.charAt(i), 0) + 1);
    }

    return freqTblS.equals(freqTblT);


        

    }
}
