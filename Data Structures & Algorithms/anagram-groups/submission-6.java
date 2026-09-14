class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        


        HashMap<String, List<String>> anagramList = new HashMap<>();


        for(String str : strs){
            int[] count = new int[26];
            for(char x : str.toCharArray()){
                count[x - 'a']++;
            }
            String key = Arrays.toString(count);
            anagramList.putIfAbsent(key, new ArrayList<>());
            anagramList.get(key).add(str);
        }

        return new ArrayList<>(anagramList.values());
    }

}
