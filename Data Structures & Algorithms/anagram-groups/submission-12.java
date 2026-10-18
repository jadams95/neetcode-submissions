class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();


        for(String s:strs){
            int[] res = new int[26];

            for(char c : s.toCharArray()){
                res[c - 'a']++;
            }

            anagramMap.computeIfAbsent(Arrays.toString(res), k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(anagramMap.values());
    }
}
