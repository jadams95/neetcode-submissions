class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<>();

        for(String line: strs){
            int[] count = new int[26];
            for(char c : line.toCharArray()){
            count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(line);
        }
        return new ArrayList<>(res.values());
    }
}
