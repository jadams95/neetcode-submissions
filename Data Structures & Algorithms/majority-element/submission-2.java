class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int res = 0, maxCount = 0;
        for(int x: nums){
            freqMap.put(x, freqMap.getOrDefault(x, 0) + 1);

            if(freqMap.get(x) > maxCount){
                res = x;
                maxCount = freqMap.get(x);
            }
        }
        return res;
    }
}