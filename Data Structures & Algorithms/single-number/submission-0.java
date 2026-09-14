class Solution {
    public int singleNumber(int[] nums) {
        // int temp;
        HashSet<Integer> intSet = new HashSet<Integer>();

        for(int num: nums){
            if(intSet.contains(num)){
                intSet.remove(num);
            } else {
                intSet.add(num);
            }
        }
        return intSet.iterator().next();
    }
}
