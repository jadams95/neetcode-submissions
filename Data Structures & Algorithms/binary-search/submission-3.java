class Solution {
    public int search(int[] nums, int target) {
        return recursiveSearch(0, nums.length - 1, nums, target);   
    }

    public int recursiveSearch(int left, int right, int[] nums, int target){
        if(left > right){
            return -1;
        }

        int m = left + ((right - left) / 2);

        if(nums[m] == target){
            return m;
        }

        return (nums[m] > target) 
            ? recursiveSearch(left, m - 1, nums, target) 
            : recursiveSearch(m + 1, right, nums, target);
    }
}
