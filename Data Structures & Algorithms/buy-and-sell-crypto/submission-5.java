class Solution {
    public int maxProfit(int[] prices) {
        // left pointer starting at 0, r pointer starting at 1
        int l = 0, r = 1;
        int maxP = 0;

        // iterate through all prices from the right while right is less than 
        // prices.length
        while(r < prices.length){
            if(prices[l] < prices[r]){
                int profit = prices[r] - prices[l];
                maxP = max(maxP, profit);
            } else {
                l = r;
            }
            r++;
        }
        return maxP;

    }
    public int min(int x, int y){
        return (x < y) ? x : y;
    }
    
    public int max(int x, int y){
        return (x > y) ? x : y;
    }
}
