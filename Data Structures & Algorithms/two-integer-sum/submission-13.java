class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> sumMaps = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            sumMaps.put(nums[i], i);
        }

        for(int y = 0; y <  nums.length; y++){
            int diff = target - nums[y];

            if(sumMaps.containsKey(diff) && sumMaps.get(diff) != y){
                return new int[]{y, sumMaps.get(diff)};
            }
        }
        return new int[0];
    }
}
