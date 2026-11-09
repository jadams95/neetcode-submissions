class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        for(char x : s.toCharArray()){
            mapS.put(x, mapS.getOrDefault(x, 0) + 1);
        }
        for(char v : t.toCharArray()){
            mapT.put(v, mapT.getOrDefault(v, 0) + 1);
        }

        return mapS.equals(mapT);
    }
}
