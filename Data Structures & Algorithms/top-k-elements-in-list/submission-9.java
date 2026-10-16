class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        List<Integer>[] freq = new List[nums.length + 1];

        for(int i = 0; i < freq.length; i++){
            freq[i] = new ArrayList<>();
        }

        for(int x: nums){
            numMap.put(x, numMap.getOrDefault(x, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry: numMap.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];

        int index = 0;


        for(int i = freq.length - 1; i > 0 && index <= k; i--){
            for(int x: freq[i]){
                res[index++] = x;

                if(index == k){
                    return res;
                }
            }
        }
        return new int[0];
    }
}
