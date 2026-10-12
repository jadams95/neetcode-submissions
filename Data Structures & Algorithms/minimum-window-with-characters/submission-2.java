public class Solution {
    public String minWindow(String s, String t) {
        if (t.isEmpty() || s.length() < t.length()) return "";

        int[] countT = new int[128];
        int required = 0;
        for (char c : t.toCharArray()) {
            if (countT[c] == 0) required++;
            countT[c]++;
        }

        int[] res = {-1, -1};
        int resLen = Integer.MAX_VALUE;

        int[] countS = new int[128];
        int formed = 0;
        int l = 0;

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            countS[c]++;
            if (countT[c] > 0 && countS[c] == countT[c]) {
                formed++;
            }

            while (l <= r && formed == required) {
                if ((r - l + 1) < resLen) {
                    resLen = r - l + 1;
                    res[0] = l;
                    res[1] = r;
                }

                char leftChar = s.charAt(l);
                countS[leftChar]--;
                if (countT[leftChar] > 0 && countS[leftChar] < countT[leftChar]) {
                    formed--;
                }
                l++;
            }
        }

        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
    }
}