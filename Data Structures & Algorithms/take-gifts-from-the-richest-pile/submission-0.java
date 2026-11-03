class Solution {
    public long pickGifts(int[] gifts, int k) {
        // k = seconds
        PriorityQueue<Integer> pile = new PriorityQueue<>(Collections.reverseOrder());

        for(int g: gifts) pile.offer(g);

        for(int t = 0; t < k; t++){
            int n = pile.poll();
            pile.offer((int) Math.floor(Math.sqrt(n)));
        }
        // pile.offer(gifts[0]);

        long sum = 0;
        while(!pile.isEmpty()) sum += pile.poll();
        return sum;
    }
}