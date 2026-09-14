class Solution {
    public int longestConsecutive(int[] nums) {

        int res = 0;
        Set<Integer> store = new HashSet<>();

        for(int num: nums){
            store.add(num);
        }

        for(int num: nums){
            int streak = 0, curr = num;
            while(store.contains(curr)){
                streak++;
                curr++;
            }
            res = max(res, streak);
        }

        // int currentIndex = 0;
        // int highSum = 0;
        // Arrays.sort(nums);

        // for(int i = 1; i < nums.length; i++){
        //     if(nums[i - 1] < nums[i]){
        //         currentIndex++;
        //         if(currentIndex > highSum){
        //             highSum = currentIndex;
        //         }
        //     } else {
        //         currentIndex = 0;
        //     }
        // }
        return res;
    }

    public int max(int a, int b){
        return a >= b ? a : b;
    }
}
