class Solution {

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();

        for(String t:strs){
            builder.append(t.length()).append('#').append(t);
        }
        return builder.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<String>();
        int i = 0;
        while(i < str.length()){
            // create a second pointer 
            int j = i;

            // check the second pointer from the position of i and increment if it's not a delimiter character
            while(str.charAt(j) != '#'){
                j++;
            }

           int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;
            result.add(str.substring(i, j));
            i = j;
        }
        return result;
    }
}