class Solution {
    public int jump(int[] nums) {
        int l = 0, r = 0, res = 0;

        while( r < nums.length - 1){
            int furthest = 0;
            for(int i = l; i <= r; i++){
                furthest = max(furthest, i + nums[i]);
            }
            l = r + 1;
            r = furthest;
            res++;
        }
        return res;
    }

    public int max(int a, int b){
        return (a >= b) ? a : b;
    }
}
