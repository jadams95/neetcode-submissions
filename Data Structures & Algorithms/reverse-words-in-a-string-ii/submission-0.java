class Solution {
public void reverseWords(char[] s) {
    // 1. Reverse the entire array
    reverse(s, 0, s.length - 1);

    // 2. Reverse each word back into readable order
    int i = 0;
    while (i < s.length) {
        int j = i;
        while (j < s.length && s[j] != ' ') j++; // look forward to the space or end
        reverse(s, i, j - 1);                    // reverse word s[i..j-1]
        i = j + 1;                               // skip past the space
    }
}

    private void reverse(char[] s, int l, int r) {
        while (l < r) {
            char c = s[l];
            s[l] = s[r];
            s[r] = c;
            l++;
            r--;
        }
    }
}
