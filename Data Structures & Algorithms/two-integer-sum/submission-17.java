class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> sumMap = new HashMap<>();


        for(int i = 0; i < nums.length; i++){
            sumMap.put(nums[i], i);
        }

        for(int y = 0; y < nums.length; y++){
            int diff = target - nums[y];
            if(sumMap.containsKey(diff) && sumMap.get(diff) != y){
                return new int[]{y, sumMap.get(diff)};
            }
        }
        return new int[0];
    }
}
