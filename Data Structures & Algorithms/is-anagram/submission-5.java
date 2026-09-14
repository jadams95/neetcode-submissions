class Solution {
    public boolean isAnagram(String s, String t) {
        int strALen = s.length();
        int strBLen = t.length();

        if(strALen != strBLen) return false;

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);


        return Arrays.equals(sArr, tArr);
    }
}
