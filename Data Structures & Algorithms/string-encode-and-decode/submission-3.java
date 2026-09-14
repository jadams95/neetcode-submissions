class Solution {

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();

        for(String str: strs){
            builder.append(str.length()).append('#').append(str);
        }
        return builder.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedList = new ArrayList<String>();
        int i = 0;

        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int patternLength = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + patternLength;
            decodedList.add(str.substring(i, j));
            i = j;
        }
        return decodedList;
    }
}
