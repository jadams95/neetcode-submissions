class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> numMap = new HashMap<>();
        

        for(int i = 0; i < nums.length; i++){
            numMap.put(nums[i], i);
        }


        for(int a = 0; a < nums.length; a++){
            int diff = target - nums[a];

            if(numMap.containsKey(diff) && numMap.get(diff) != a){
                return new int[]{a, numMap.get(diff)};
            }
        }
        return new int [0];
    }
}
