class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 1;
        int maxP = 0;
        while(r < prices.length){
            // no need to set the middle guess it's not binary search 
            // maxP = prices[r] - prices[l];
            if(prices[l] < prices[r]){
                maxP = Math.max(prices[r] - prices[l], maxP);
            } else {
                l = r;
            }
            r++;
        }
        return maxP;
    }
}
