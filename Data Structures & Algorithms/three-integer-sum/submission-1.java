class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();



        // int arrLength = nums.length / 2;
        // int resultLen = nums.length / arrLength;

        // List<Integer>[] intArr = new List[resultLen];
        HashSet<Integer[]> uniqueTriplets = new HashSet<>();

        // int left = 0;
        // int right = nums.length;


        for(int i = 0; i < nums.length; i++){

            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i - 1]) continue;


            int l = i + 1, r = nums.length - 1;

            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum > 0){
                    r--;
                } else if(sum < 0){
                    l++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while(l < r && nums[l] == nums[l - 1])
                    {
                        l++;
                    }
                }
            }
        }
        return res;
    }
}
