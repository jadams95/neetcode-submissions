class Solution {

    int[] memo;

    public int minCostClimbingStairs(int[] cost) {

        memo = new int[cost.length];
        Arrays.fill(memo, -1);
        return min(dfs(cost, 0), dfs(cost, 1));
        // // int index = 0;
        // // int indexJ = cost.length % 2;
        // // int costLength = cost.length;
        // // System.out.println(costLength);


        // // while(index < cost.length){
        // //     int costX = 0;
        // //     int costOfSecondStep = 0;
        // //     costOfSecondStep += cost[indexJ];
        // //     costX += cost[index];
        // //     if(costX ){}
        // //     // while(indexJ < cost.length){
        // //     //     indexJ += 2;


                
        // //     //     // if the cost of second Step is cant go any further then go no further
        // //     //     //  to reach
        // //     //     //  and increment by cost of 1 
        // //     // }
        // //     costX = costX + costOfSecondStep;

        // //     System.out.println(index);

        // //     return (costX >= costOfSecondStep) ? dfs(cost, i + 1) : dfs(costOfSecondStep);
        // //     }

        //     return -1;
        // we solve for the first floor of the staircase problem and 
        // while in the second loop we check if we can get to the second floor 
        // while(){} 
    }

    public int dfs(int[] cost, int index){
        if( index >= cost.length){
            return 0;
        }
        if(memo[index] != -1){
            return memo[index];
        }
        memo[index] = cost[index] + min(dfs(cost, index + 1), dfs(cost, index + 2));
        
        return memo[index];
    }

    public int min(int a, int b){
        return (a<=b) ? a : b;
    }
}
