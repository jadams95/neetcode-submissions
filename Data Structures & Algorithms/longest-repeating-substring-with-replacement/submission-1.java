class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> characterMap = new HashMap<>();
        int res = 0;

        int l = 0, maxf = 0;
        for(int r = 0; r < s.length(); r++){
            characterMap.put(s.charAt(r), characterMap.getOrDefault(s.charAt(r), 0) + 1);
            maxf = max(maxf, characterMap.get(s.charAt(r)));

            // shifting the window ** loop peeling technique we want to remember most
            while((r - l + 1) - maxf > k){
                characterMap.put(s.charAt(l), characterMap.get(s.charAt(l)) - 1);
                l++;
            }
            // checks the biggest size of the window from res
            res = max(res, r - l + 1);
        }
        // we need to traverse map and access most frequent and change the least frequent by l
        System.out.println(characterMap.entrySet());

        // for(Map.Entry<Character, Integer> entry: characterMap.entrySet()){
        //    int x = entry.getValue();
        //     if(entry.getValue() == k){
        //         entry.put()
        //     }
        // }     

        return res;
        
    }

    public int max(int a, int b){
        return (a >= b) ? a : b;
    }
}
