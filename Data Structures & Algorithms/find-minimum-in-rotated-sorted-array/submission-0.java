class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        // int rotation = 0;
        // int currHighestInd = 0;
        // System.out.println(nums[r]);
        // System.out.println(nums.length - 1);
        while(l < r){
            
            // currHigestInd = max(nums[r], nums[l]);
            int m = l + (r - l) / 2;

            if(nums[m] < nums[r]){
                r = m;
            }
            // window shift between 1 .. n times
            else {
                l = m + 1;
            }
        }
        // System.out.println(rotation);
        return nums[l];
    }
}
