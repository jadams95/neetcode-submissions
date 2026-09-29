class Solution {
    public int maxProfit(int[] prices) {
        int totalP = 0;
        for(int i = 0; i < prices.length; i++){ 
            int buy = prices[i];
            for(int j = i + 1; j < prices.length; j++){
                int sell = prices[j];
                totalP = Math.max(totalP, sell - buy);
            }
        }
        return totalP;
    }
}
