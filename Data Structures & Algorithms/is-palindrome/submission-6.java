class Solution {
    public boolean isPalindrome(String s) {
    s = s.replace("?", "");
    s = s.replace(" ", "");
    s = s.replace("'", "");
    s = s.replace(",", "");
    s = s.replace(".", "");
    s = s.replace(":", "");
      s = s.toLowerCase();
      System.out.println(s);

    char[] charArray = new char[s.length()];
    String v;
      for (int a = 0; a < s.length(); a++){
        if(Character.isAlphabetic(s.charAt(a)) || Character.isDigit(s.charAt(a))){
            System.out.println(charArray[a]);
                        charArray[a] = s.charAt(a);
        }
      }
        v = new String(charArray);
      System.out.println(v.length() / 2);
        for(int i = 0; i < v.length() / 2; i++){
            System.out.println(v.charAt(v.length() / 2 - i - 1));
            // if(s.)
            if(v.charAt(i) != v.charAt(v.length() - i - 1)) return false;
        }
         return true;
    }
}
