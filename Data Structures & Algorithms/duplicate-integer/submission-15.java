class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();

        for(int x: nums){
            if(numSet.contains(x)){
                return true;
            }
            numSet.add(x);
        }
        return false;
    }
}