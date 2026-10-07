class Solution {

    public String encode(List<String> strs) {
        StringBuilder build = new StringBuilder();


        for(String s:strs){
            build.append(s.length()).append("#").append(s);
        }
        return build.toString();
    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> res = new ArrayList<String>();
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            // i, j
            //0, 0,
            //  
            // 1
            // 4#test
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;
            res.add(str.substring(i, j));
            i = j;
        }

        return res;
    }
}
