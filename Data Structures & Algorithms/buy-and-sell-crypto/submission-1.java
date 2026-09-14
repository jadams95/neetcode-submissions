class Solution {
    public int maxProfit(int[] prices) {
        
        int l = 0, r = 1;
        int maxP = 0;
        while(r < prices.length){
                if(prices[l] < prices[r]){
                    int profit = prices[r] - prices[l];
                    maxP = maxNumber(maxP, profit);
                } else {
                    l = r;
                }
                r++;
            }
            return maxP;
        }

        public int maxNumber(int a, int b){
            // int temp = 
            // if(a.class == Integer.class || b.class == Integer.class)
            return (a >= b) ? a : b;
        }
    }
