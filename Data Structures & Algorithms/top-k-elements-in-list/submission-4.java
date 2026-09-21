class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new ArrayList[nums.length + 1];

        for(int i = 0; i < freq.length; i++){
            freq[i] = new ArrayList<>();
        }

        for(int x: nums){
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry:count.entrySet()){

            freq[entry.getValue()].add(entry.getKey());
        }

        System.out.println(count.keySet());
        int[] res = new int[k];

        int index = 0;

        for(int i = freq.length - 1; i > 0 && index < k; i--){
            for(int x: freq[i]){
                res[index++] = x;
                if(index == k){
                    return res;
                }
            }
        }
        
        return res;
        }
}
