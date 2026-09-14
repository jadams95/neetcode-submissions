class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int res = r;
        while(l <= r ){
            int k = (l + r) / 2;
            long totalTime = 0;

        // int l = 0, r = piles.length, k = piles.length / 2; 
           
        // long totalTime = 0;
            for(int pile: piles){
                totalTime += (int) Math.ceil((double) pile / k);
            }
        // 
        // if you finish pile you cannot eat from another pile for that hour decrease an hour 
            if(totalTime <= h){
                res = k;
                r = k - 1;
            } else {
                l = k + 1;
            }
        }
    return res;
    }
}
