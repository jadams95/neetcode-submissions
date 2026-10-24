class Solution {
    public void sortColors(int[] nums) {
        int i = 0, l = 0, r = nums.length - 1;

        while(i <= r){
            if(nums[i] == 0){
                swap(nums, l, i);
                l++;
            } else if( nums[i] == 2){
                swap(nums, i, r);
                r--;
                i--;
            }
            i++;
        }


    }

    private void swap(int[] nums, int i, int j){
        // swap technique in quick sort partition
        // assign a temp variable to nums[i]
        int temp = nums[i];
        // assign nums[i] to num[j]
        nums[i] = nums[j];
        // assign nums[j] to temp which is nums[i]
        nums[j] = temp;
    }
}