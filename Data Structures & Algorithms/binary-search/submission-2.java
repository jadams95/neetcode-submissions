class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        // int middle = left + ((right - left) / 2);

        while(left <= right){
            int middle = left + ((right - left) / 2);
            // if num middle is greater than the target subtract the right pointer from the middle - 1
            if(nums[middle] > target){
                right = middle - 1;
            }
            // else if nums middle is less than target than decrease
            else if (nums[middle] < target){
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;

    }
}
