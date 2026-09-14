class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
                // if the factor in the decision is part of a sequence of 
        // itself plus another indexes == target
        res = new ArrayList<>();
        Arrays.sort(nums);
        // List<Integer> sub = new ArrayList<>();

        dfs(nums, target, 0, 0, new ArrayList<>()); 
        return res;
    }


    private void dfs(int[] nums, int target, int currentSum, int index, List<Integer> subset){
        if(currentSum == target){
            res.add(new ArrayList<>(subset));
            return;
        }

        // int sum += currentSum
        for(int j = index; j < nums.length; j++){
            if(currentSum + nums[j] > target){
                return;
            }
            subset.add(nums[j]);
            dfs(nums, target, currentSum + nums[j], j, subset);
            subset.remove(subset.size() - 1);
        }


    }


}
