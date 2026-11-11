class Solution {
    public void reverseWords(char[] s) {
        final int n = s.length;
        reverse(s, 0, n - 1);

        int start = 0;
        for (int i = 0; i <= n; i++) {
            if (i == n || s[i] == ' ') {
                reverse(s, start, i - 1);
                start = i + 1;
            }
        }
    }

    private static void reverse(char[] s, int l, int r) {
        while (l < r) {
            char c = s[l];
            s[l++] = s[r];
            s[r--] = c;
        }
    }
}
