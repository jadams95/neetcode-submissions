class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anag = new HashMap<>();

        for(String str:strs){
            int[] count = new int[26];
            for(char a: str.toCharArray()){
                count[a - 'a']++;
            }
            String key = Arrays.toString(count);
         anag.putIfAbsent(key, new ArrayList<>());
           anag.get(key).add(str);
        }
        return new ArrayList<>(anag.values());
    }
}
