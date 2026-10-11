class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        for(int y = 0; y < nums.length; y++){
            int diff = target - nums[y];

            if(map.containsKey(diff) && map.get(diff) != y){
                return new int[]{y, map.get(diff)};
            }
        }


        return new int[0];
    }
}
