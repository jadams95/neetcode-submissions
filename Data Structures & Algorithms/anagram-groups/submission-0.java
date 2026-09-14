class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> res = new HashMap<>();


        // var x = new String[strs.length];
        // List<List<String>> csvList = new ArrayList<List<String>>();

        //pretend you're looping through lines in a file here
        for(String line : strs)
        {
            int[] count = new int[26];
            for(char c : line.toCharArray()){
                count[c - 'a']++;
                System.out.println(count[c - 'a']++);

            }
            String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(line);
        }
        return new ArrayList<>(res.values());
    }
}
