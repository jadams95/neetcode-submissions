class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagrams = new HashMap<>();


        for(String s:strs){
            int[] res = new int[26];

            for(char x: s.toCharArray()){
                res[x - 'a']++;
            }

            String key = Arrays.toString(res);
            anagrams.putIfAbsent(key, new ArrayList<>());
            anagrams.get(key).add(s);
        }
        return new ArrayList<>(anagrams.values());
    }
}
