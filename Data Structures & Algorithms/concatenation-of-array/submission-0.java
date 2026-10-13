class Solution {
    public int[] getConcatenation(int[] nums) {
        //  nums length - nums.length * 2
        // 4 - 8 
        // 
        int[] res = new int[nums.length * 2];
        int index = 0;

        for(int i = 0; i < nums.length; i++){
            res[index++] = nums[i];
        }
        for(int y = 0; y < nums.length; y++){
                res[index++] = nums[y];
        }
        return res;


    }
}