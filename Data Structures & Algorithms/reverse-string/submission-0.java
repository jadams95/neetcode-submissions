public class Solution {
    public void reverseString(char[] s) {
       int l = 0, r = s.length - 1;

       while(l < r){
        char temp = s[l];
        s[l] = s[r];
        s[r] = temp;
        l++;
        r--;
       }
    }

    private boolean isAsciiCharacter(char c){
        return (c >= 'a' || c <= 'z' &&
        c >= 'A' || c <= 'Z' ||
        c >= '0' || c <= '9');
    }
}