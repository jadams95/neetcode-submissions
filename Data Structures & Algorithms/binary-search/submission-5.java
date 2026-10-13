class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while(l <= r){

            // remember operation that allows you to guess in the middle of the array
            int mid = l + ((r - l) / 2);

            // remember logic for increase the pointer to the left or right depending on the target
            if(nums[mid] < target){
                l = l + 1;
            } else if(nums[mid] > target){
                r = r - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
