class Solution {
    public boolean isPalindrome(String s) {
    int l = 0, r = s.length() - 1;

    System.out.println(s.charAt(s.length() - 1));

    while(l < r){
        while(l < r && !alphaNum(s.charAt(l))){
            l++;
        }
        while(r > l && !alphaNum(s.charAt(r))){
            r--;
        }
        if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
            return false;
        }
        l++; r--;
    }
    // return true;
    // s = s.replace("?", "");
    // s = s.replace(" ", "");
    // s = s.replace("'", "");
    // s = s.replace(",", "");
    // s = s.replace(".", "");
    // s = s.replace(":", "");
    //   s = s.toLowerCase();
    //   System.out.println(s);

    // char[] charArray = new char[s.length()];
    // String v;


    // //   for (int a = 0; a < s.length(); a++){
    // //     if(Character.isAlphabetic(s.charAt(a)) || Character.isDigit(s.charAt(a))){
    // //         System.out.println(charArray[a]);
    // //                     charArray[a] = s.charAt(a);
    // //     }
    // //   }
    //     v = new String(charArray);
    //   System.out.println(v.length() / 2);
    //     for(int i = 0; i < v.length() / 2; i++){
    //         System.out.println(v.charAt(v.length() / 2 - i - 1));
    //         // if(s.)
    //         if(v.charAt(i) != v.charAt(v.length() - i - 1)) return false;
    //     }
         return true;
    }

    public boolean alphaNum(char c){
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z'||
                c >= '0' && c <= '9');
    }
}
