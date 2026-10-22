class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int res = 0, maxCount = 0;
        for(int y: nums){
            freqMap.put(y, freqMap.getOrDefault(y, 0) + 1);
            if(freqMap.get(y) > maxCount){
                res = y;
                maxCount = freqMap.get(y);
            }
        }
        return res;
    }
}