class Solution {
        public int search(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) return -1;
        int base = 0;
        while (n > 1) {
            int half = n >>> 1;
            base = (nums[base + half] <= target) ? base + half : base;
            n -= half;
        }
        return nums[base] == target ? base : -1;
    }
}
