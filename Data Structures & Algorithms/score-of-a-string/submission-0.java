class Solution {
    public int scoreOfString(String s) {
        
        char[] charArr = s.toCharArray();
        int score = 0;
    
        for(int x = 1; x < charArr.length; x++){
            score += Math.abs(charArr[x] - charArr[x - 1]);
        }
        return score;
    }
}