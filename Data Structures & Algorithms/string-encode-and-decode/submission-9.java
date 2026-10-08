class Solution {

    public String encode(List<String> strs) {
        StringBuilder build = new StringBuilder();


        for(String s:strs){
            build.append(s.length()).append("#").append(s);
        }
        return build.toString();
    }

    public List<String> decode(String str) {
    List<String> res = new ArrayList<>();
    int i = 0;
    while (i < str.length()) {
        int j = i;                                 // reset for every entry
        while (str.charAt(j) != '#') {
            j++;
        }
        int length = Integer.parseInt(str.substring(i, j));
        i = j + 1;
        j = i + length;                                   
        // skip '#' exactly once
        res.add(str.substring(i, j));
        i = j;
    }
    return res;
    }
}
