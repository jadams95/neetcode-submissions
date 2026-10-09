class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groupAnagramMap = new HashMap<>();


        for(String str: strs){
            int[] bitmap = new int[26];

            for(char c: str.toCharArray()){
                bitmap[c - 'a']++;
            }
            String key = Arrays.toString(bitmap);
            groupAnagramMap.putIfAbsent(key, new ArrayList<>());
            groupAnagramMap.get(key).add(str);
        }

        return new ArrayList<>(groupAnagramMap.values());

    }
}
