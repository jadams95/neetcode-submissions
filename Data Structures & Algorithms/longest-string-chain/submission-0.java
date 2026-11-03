class Solution {
    public int longestStrChain(String[] words) {
        // SRTBOT
        // the first must be formed by inserting exactly one lowercase letter into the previous word
        
        // B: may choose the words in any order, and a sequence containing just one word is valid
        Arrays.sort(words, Comparator.comparingInt(String::length));
        Map<String, Integer> best = new HashMap<>();
        int answer = 1;

        // int wordCnt = 0;

        for(String word: words){
           int length = 1;

           for(int i = 0; i < word.length(); i++){
            length = Math.max(length, 1 + best.getOrDefault(word.substring(0, i) + word.substring(i + 1),0));
           }
            best.put(word, length);
            answer = Math.max(answer, length);
           }
           return answer;
        }
}

