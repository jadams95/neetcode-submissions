class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int speed = 1;
        // left, right

        int l = 0, r = piles.length, k = piles.length / 2; 
        
        while(true){       
        long totalTime = 0;
        for(int pile: piles){
            totalTime += (int) Math.ceil((double) pile / speed);
        }
        // 
        // if you finish pile you cannot eat from another pile for that hour decrease an hour 
        if(totalTime <= h){
            return speed;
        }
        speed++;
        }
    }
}
