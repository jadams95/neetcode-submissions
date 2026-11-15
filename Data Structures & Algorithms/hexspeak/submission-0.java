class Solution {
    public String toHexspeak(String num) {
        char[] hex = Long.toHexString(Long.parseLong(num))
                         .toUpperCase()
                         .toCharArray();

        for (int i = 0; i < hex.length; i++) {
            if (hex[i] == '0') hex[i] = 'O';
            else if (hex[i] == '1') hex[i] = 'I';
            else if (hex[i] < 'A' || hex[i] > 'F') return "ERROR"; // digits 2–9
        }
        return new String(hex);
    }
}
