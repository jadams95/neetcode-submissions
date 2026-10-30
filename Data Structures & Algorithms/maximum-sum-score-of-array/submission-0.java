class Solution {
    public long maximumSumScore(int[] nums) {
        // index i in intger array define it's sum score as the larger of
        // the sum from the start of the array through index if
        // the sum from index i through the end of the array'

        long total = 0;
        for(int x: nums) total += x;
        long prefix = 0, answer = total;
        for(int value:nums){
            answer = Math.max(answer, total - prefix);
            prefix += value;
            answer = Math.max(answer, prefix);
        }
        return answer;
    }
}
