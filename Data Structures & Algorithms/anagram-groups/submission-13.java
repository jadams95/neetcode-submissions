class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> strMap = new HashMap<>();

        for(String s: strs){
            int[] res = new int[26];

            for(char strChar: s.toCharArray()){
                res[strChar - 'a']++;
            }
            String key = Arrays.toString(res);

            // computeIfAbsent vs putIfAbsent()
            strMap.computeIfAbsent(key, k -> new ArrayList<String>()).add(s);
        }

        return new ArrayList<>(strMap.values());
    }
}
