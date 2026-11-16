class Solution {
    public long maximumAlternatingSubarraySum(int[] nums) {
        // SRTBOT
        
        long odd = -100_000L, even = odd, answer = odd;
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            long nextOdd = Math.max((long) nums[i], even + nums[i]);
            even = odd - nums[i];
            odd = nextOdd;
            answer = Math.max(answer, Math.max(odd, even));

       
            // // 2
            // if(nums.length % 2 >= 1){
            //     sum -= nums[i]; 
            // } else {
            //     sum += nums[i];
            // }
        }
        return answer;
    }
}
