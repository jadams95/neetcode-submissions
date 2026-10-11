class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> strSMap = new HashMap<>();
        HashMap<Character, Integer> strTMap = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }



        for(char c: s.toCharArray()){
            strSMap.put(c, strSMap.getOrDefault(c, 0) + 1);
        }

        for(char x: t.toCharArray()){
            strTMap.put(x, strTMap.getOrDefault(x, 0) + 1);
        }

        return strSMap.equals(strTMap);
    }
}
