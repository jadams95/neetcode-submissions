class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqNums = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for(int i = 0; i < freq.length; i++){
            freq[i] = new ArrayList<>();
        }


        for(int x: nums){
            freqNums.put(x, freqNums.getOrDefault(x, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry: freqNums.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int index = 0;
        int[] res = new int[k];

        for(int a = freq.length - 1; a > 0 && index < k; a--){
            for(int b:freq[a]){
                res[index++] = b;

                if(index == k){
                    return res;
                }
            }
        }
        return res;
    }
}
