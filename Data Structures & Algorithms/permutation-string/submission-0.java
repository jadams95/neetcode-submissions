class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // int end = s2.length();

        HashMap<Character, Integer> count1 = new HashMap<Character, Integer>();

        // int l = 0, int r = s2.length();

        // // Creating the List of Integers 
        // List<Character> freq = new List[s1.length()]

        // int windowSize = s1.length();

        for(char c : s1.toCharArray()){
            count1.put(c, count1.getOrDefault(c, 0) + 1);
        }


        // Sliding the window
        int need = count1.size();
        // Step 3: insert into the HashMap the 

        // Step 5:  check if the List of Characters match the keys 
        for(int i = 0; i < s2.length(); i++){
            Map<Character, Integer> count2 = new HashMap<>();

            int cur = 0;
            for(int j = i; j < s2.length(); j++){
            // insert into second map s2
                char c = s2.charAt(j);
                count2.put(c, count2.getOrDefault(c, 0) + 1);

            // or do we want comparison of the map while we're inserting it a window of

                if(count1.getOrDefault(c, 0) < count2.get(c)){
                    break;
                }
                if(count1.getOrDefault(c, 0) == count2.get(c)){
                    cur++;
                }
                if(cur == need){
                    return true;
                }
            }
        }
         return false;
    }
}