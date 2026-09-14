class Solution {
    public int maxSubArray(int[] nums) {
       
       return dfs(nums, 0, false);
        // Arrays.sort(nums);
        
        // if(nums.length == 1){
        //     return nums[0];
        // }
        // if(nums.length == 0){
        //     return 0;
        // }
        
        // int m = nums.length / 2;
        // System.out.println(Arrays.toString(nums));
        // int maxSum = 0;


        // for(int x: nums){
        //     if(x > 0){
        //         maxSum += x;
        //     }
        // }
        // return maxSum;
    }

    private int dfs(int[] num, int i, boolean flag){
        if(i == num.length){
            System.out.println((int) -1e3);
            return flag ? 0 : (int) -1e3;
        }
        if(flag){
            return max(0, num[i] + dfs(num, i + 1, true));
        }
        return max(dfs(num, i + 1, false), num[i] + dfs(num, i + 1, true));
    }

    public int max(int a, int b){
        return (a>=b) ? a : b;
    }
}
