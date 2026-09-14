class Solution {
    private int[] maxLoot;

    public int rob(int[] nums){
        maxLoot = new int[nums.length];
        Arrays.fill(maxLoot, -1);
        return dfs(nums, 0);
    }

    private int dfs(int[] nums, int i) {
        // we start with 0 index 
        // check if the house not adjacent is worht robbing 
        // if its not worht robbing shift the start of the window by 1
        //  
        // int partition 5 / 2 = 2 one with size 2 and one with 3 but you
        // use had the first base case but need the second base case 
        if (i >= nums.length) return 0;

        // if the maxLost not equal to -1 then return maxLoot of i windowLength
        if(maxLoot[i] != -1){
            return maxLoot[i];
        }
        // maxLoot[i] = max(dfs(nums, i + 1), nums[i] + dfs(nums, i + 2))

        // indexSizes = oddIndex - 1, 3;

        // recursive case I had 
        // max(maxLoot,  max(rob(evenIndexes), rob(oddIndexes)));

        // int dynamicSlide = nums.length % 2; 
        // int maxLoot = 0;

        // for(int i = 0; i < nums.length; i++){
        //     int j = i;

        // use dfs to return either 0, 1 index start window for incrementing by 2 or by 1 
        //     if(i < 1){}
        //     // adjacent houses for odd indexes
        //     if(i % 2 == 1){
        //        sumProfit = nums[j + 1] > nums[j]
        //     }
        //     // adjacent houses for indexes even or modulas 0 when divided by 2
        //     if(i % 2 == 0){
        //        sumProfit = nums[j]
        //     }
        //     else {

        //     }
            
        // }

        maxLoot[i] = max(dfs(nums, i + 1), nums[i] + dfs(nums, i + 2));
        return maxLoot[i];
    }

    public int max(int a, int b){
        return (a >= b) ? a : b;
    }
}
