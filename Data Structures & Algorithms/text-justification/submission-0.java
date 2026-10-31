class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();

        int i = 0; 
        while (i < words.length) {

            
            int lineLen = words[i].length(); 
            int y = i + 1;
            while (y < words.length && lineLen + 1 + words[y].length() <= maxWidth) {
                lineLen += 1 + words[y].length();
                y++;
            }
            

            StringBuilder line = new StringBuilder(maxWidth);
            int gaps = y - i - 1; 

        
            if (y == words.length || gaps == 0) {
                for (int x = i; x < y; x++) {
                    line.append(words[x]);
                    if (x < y - 1) line.append(' ');
                }
                while (line.length() < maxWidth) line.append(' ');
            }
           
            else {
                int letters = lineLen - gaps;          
                int totalSpaces = maxWidth - letters;
                int base = totalSpaces / gaps;          
                int extra = totalSpaces % gaps;        

                for (int x = i; x < y; x++) {
                    line.append(words[x]);
                    if (x < y - 1) {
                        int spaces = base + ((x - i) < extra ? 1 : 0);
                        line.append(" ".repeat(spaces));
                    }
                }
            }

            result.add(line.toString());
            i = y; 
        }

        return result;
    }
}