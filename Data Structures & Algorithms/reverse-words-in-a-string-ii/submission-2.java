class Solution {
    public void reverseWords(char[] s) {
        int n = s.length;
        char[] out = new char[n];
        int w = 0, end = n;

        for (int i = n - 1; i >= -1; i--) {
            if (i == -1 || s[i] == ' ') {
                int start = i + 1;
                int len = end - start;
                System.arraycopy(s, start, out, w, len); // bulk copy the word
                w += len;
                if (i >= 0) out[w++] = ' ';
                end = i;
            }
        }
        System.arraycopy(out, 0, s, 0, n);
    }

    private static void reverse(char[] s, int l, int r) {
        while (l < r) {
            char c = s[l];
            s[l++] = s[r];
            s[r--] = c;
        }
    }
}
