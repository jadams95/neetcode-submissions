class Solution {
    public int[] twoSum(int[] nums, int target) {
        // nums[i] + nums[j] == target
        // HashMap<Integer, List<Integer>> hashMap = new HashMap<>();
        // ArrayList<Integer> resArr = new ArrayList<>();
        for(int x = 0; x < nums.length; x++){
            for(int a = x + 1; a < nums.length; a++){
                if(nums[x] + nums[a] == target && x != a){
                  return new int[]{x, a};
                }
            }
            // if nums[i] + nums[j] == target && i != j return array
            
        }
        return new int[1];
    }
}
