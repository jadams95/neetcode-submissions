class Solution {

    public String encode(List<String> strs) {
        String test;
        StringBuilder res = new StringBuilder();
        for(String str: strs){
            res.append(str.length()).append('#').append(str);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;

        while(i < str.length()) {
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;
            res.add(str.substring(i, j));
            i = j;
        }
        // String[] stringLeth = str.split("#");
        // String[] res = new String[stringLeth.length];
        
        return res;
    }
}
