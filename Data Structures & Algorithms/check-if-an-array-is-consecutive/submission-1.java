class Solution {
    public boolean isConsecutive(int[] nums) {
        // x + n - 1
        // when x is the value and n is the nums array
        // 2 + 3 - 1
        // 6 + 3 - 1
        // series is increasing or decreasing
        // int index = 0;
        // int sum = 0;


        int low = nums[0], high = nums[0];
        HashSet<Integer> seen = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            // sum = nums[i] + nums.length - 1; 
            if(!seen.add(nums[i])){
                return false;
            }
            // lower bounds of the series
            low = Math.min(low, nums[i]);
            // upper bounds of the series
            high = Math.max(high, nums[i]);
        }
         return high - low + 1 == nums.length;
    }
}
