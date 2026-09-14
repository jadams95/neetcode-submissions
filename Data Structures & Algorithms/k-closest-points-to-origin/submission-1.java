class Solution {
    public int[][] kClosest(int[][] points, int k) {
      PriorityQueue<int[]> maxHeap = new PriorityQueue<>((y, x) -> 
      Integer.compare(x[0] * x[0] + x[1] * x[1], y[0] * y[0] + y[1] * y[1]));
        

        for(int[] point: points){
            maxHeap.offer(point);
            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        
        int[][] res = new int[k][2];
        int i = 0;
        while(!maxHeap.isEmpty()){
            res[i++] = maxHeap.poll();
        }
        return res;
        // comparator of the k, lower value x0:2y  x1:1y till x2:2y
    }
}
