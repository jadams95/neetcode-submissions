class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        List<Integer>[] freq = new List[nums.length + 1];

        for(int i = 0; i < freq.length; i++){
            freq[i] = new ArrayList<>();
        }

        for(int x:nums){
            freqMap.put(x, freqMap.getOrDefault(x, 0) + 1);
        }


        for(Map.Entry<Integer, Integer> entry: freqMap.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        
        int index = 0;

        for(int i = freq.length - 1; i > 0 && index < k; i--){
            for(int x:freq[i]){
                res[index++] = x;
                if(index == k){
                    return res;
                }
            }
        }
        return new int[0];
    }
}
