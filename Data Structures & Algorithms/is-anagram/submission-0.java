class Solution {
    public boolean isAnagram(String s, String t) {
      if(s.length() != t.length()){
        return false;
      }
      
      
    //   var x = s.toCharArray();
    //   var y = t.toCharArray();
    
    HashMap<Character, Integer> freqCountS = new HashMap<Character, Integer>();
    HashMap<Character, Integer> freqCountT = new HashMap<Character, Integer>();




    for(int e = 0; e < s.length(); e++){
        // System.out.println("Position in array 1: " + [e] + " Position in array 2: " + y[e] );
            freqCountS.put(s.charAt(e), freqCountS.getOrDefault(s.charAt(e), 0) + 1);
            freqCountT.put(t.charAt(e), freqCountT.getOrDefault(t.charAt(e), 0) + 1);
        // if key does not in Hash Table then put
        // else update the value of the key to count;
    }
    return freqCountS.equals(freqCountT);
    // we need the queue to look at each character 
    // if the character already exists in the map 
    // we update the value for the integer.
    //

    }
}
