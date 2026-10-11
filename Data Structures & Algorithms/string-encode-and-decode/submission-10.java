public class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (String s : strs) {
            res.append(s.length()).append('#').append(s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int l = 0;
        while (l < str.length()) {
            int j = l;
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(l, j));
            l = j + 1;
            j = l + length;
            res.add(str.substring(l, j));
            l = j;
        }
        return res;
    }
}