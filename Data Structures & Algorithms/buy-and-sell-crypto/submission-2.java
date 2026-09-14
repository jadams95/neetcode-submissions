class Solution {
    public int maxProfit(int[] prices) {
        
        int maxP = 0;
        int minBuy = prices[0];

        for(int sell: prices){
            maxP = maxNumber(maxP, sell - minBuy);
            minBuy = minNumber(minBuy, sell);
        }
            return maxP;
        }

        public int maxNumber(int a, int b){
            // int temp = 
            // if(a.class == Integer.class || b.class == Integer.class)
            return (a >= b) ? a : b;
        }

        public int minNumber(int a, int b){
            return (a <= b) ? a : b;
        }
    }
