class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        // int currentSum = 0;
        int maxSum = nums[0];
        
        // 15 - 1 + 6 % 6
        // (i - 1 + n) % n

        int n = nums.length;


        for(int i = 0; i < n; i++){
            int currentSum = 0;

            for(int j = i; j < i + n; j++){
                currentSum += nums[j % n];
                maxSum = Math.max(maxSum, currentSum);
            }
            
        }

        return maxSum;
    }
}