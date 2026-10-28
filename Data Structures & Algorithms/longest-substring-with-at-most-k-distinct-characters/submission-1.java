class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        // String s and integer k
        // return the length of the longest substring of s that contains at most k distinct character 
        int n = s.length();
        int maxSum = 0;
        Map<Character, Integer> freqCharMap = new HashMap<>();
        int left = 0;
        
        for(int right = 0; right < n; right++){
            freqCharMap.put(s.charAt(right), freqCharMap.getOrDefault(s.charAt(right), 0) + 1);

            while(freqCharMap.size() > k){
                freqCharMap.put(s.charAt(left), freqCharMap.get(s.charAt(left)) - 1);
                if(freqCharMap.get(s.charAt(left)) == 0){
                    freqCharMap.remove(s.charAt(left));
                }
                left++;
            }
            maxSum = Math.max(maxSum, right - left + 1);
        }
        return maxSum;
    }
}
