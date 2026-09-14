class Solution {

    public String encode(List<String> strs) {
        StringBuilder build = new StringBuilder();

        for(int i = 0; i < strs.size(); i++){
            build.append(strs.get(i).length()).append('#').append(strs.get(i));
        }
        return build.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<String>();
        int i = 0;
        while( i < str.length()){
            // create second pointer to increment and look for # delimiter
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
        return res;
    }
}
