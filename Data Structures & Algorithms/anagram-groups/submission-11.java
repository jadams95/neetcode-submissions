class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramMap = new HashMap<>();


        for(String s:strs){
            int[] res = new int[26];

            for(char c:s.toCharArray()){
                res[c - 'a']++;
            }

            String key = Arrays.toString(res);

            anagramMap.putIfAbsent(key, new ArrayList<>());
            anagramMap.get(key).add(s);
        }
        return new ArrayList<>(anagramMap.values());
    }
}
