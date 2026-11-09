class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> strMapList = new HashMap<>();

        for(String s:strs){
            int[] bitMap = new int[26];

            for(char c: s.toCharArray()){
                bitMap[c - 'a']++;
            }

            strMapList.computeIfAbsent(Arrays.toString(bitMap), k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(strMapList.values());
    }
}
