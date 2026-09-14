class Solution {
    public int findDuplicate(int[] nums) {
        // int length = nums.length + 1;
        HashSet<Integer> seen = new HashSet<Integer>();

        for(int num : nums){
            // if its not seen that add to see
            if(!seen.contains(num)){
                seen.add(num);
            }
            else {
                return num;
            }
        }
        return 0;
    }
}