class Solution {
    public String longestCommonPrefix(String[] strs) {
        // StringBuilder build = new StringBuilder();
        String start = strs[0];

        for(int i = 1; i < strs.length; i++){
            int j = 0;

            while(j < Math.min(start.length(), strs[i].length())){
                if(start.charAt(j) != strs[i].charAt(j)){
                    break;
                }
                j++;
            }

            start = start.substring(0, j);
        }
        return start;

    }
}