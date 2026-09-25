class Solution {

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();
        for(String s:strs){
            builder.append(s.length()).append('.').append(s);
        }
        return builder.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '.'){
                j++;
            }

            int strlen = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + strlen;
            res.add(str.substring(i, j));
            i = j;
        }
        return res;
    }
}
