class Solution {
    public boolean canJump(int[] nums) {
        return dfs(nums, 0);
    }

    private boolean dfs(int[] nums, int i){
        if(i > nums.length){
            return false;
        }

        if(i == nums.length - 1){
            return true;
        }
        int end = min(nums.length - 1, i + nums[i]);

        for(int j = i + 1; j <= end; j++){
            if(dfs(nums, j)){
                return true;
            }
        }
        return false;

    }

    public int min(int a, int b){
        return (a <= b) ? a : b;
    }

}
