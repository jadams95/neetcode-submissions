class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;

        while(l < r){
            // assign a variable for currentSum
            int currentSum = numbers[l] + numbers[r];

            // if currentSum is greater than target since nubmers are in monotonic increasing order 
            if(currentSum > target){
                r--;
                // decrease window from right
            } else if (currentSum < target){
                l++;
                // increase towards right pointer 
            } else {
                return new int[] {l + 1, r + 1};
            }
        }
        return new int[0];
    }
}
