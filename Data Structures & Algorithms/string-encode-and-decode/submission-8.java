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
        int length = 0;                                 // reset for every entry
        while (str.charAt(i) != '#') {
            length = length * 10 + (str.charAt(i) - '0');
            i++;
        }
        i++;                                            // skip '#' exactly once
        res.add(str.substring(i, i + length));
        i += length;
    }
    return res;
    }
}
