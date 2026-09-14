class Solution {
    public int lastStoneWeight(int[] stones) {
        // List<Integer>[] intList = new List[stones.length - 1];
        PriorityQueue<Integer> que = new PriorityQueue<Integer>();
        // Arrays.sort(stones);

        for(int s : stones){
            que.offer(-s);
        }

        while(que.size() > 1){
            int first = que.poll();
            int second = que.poll();
            if(second > first){
                que.offer(first - second);
            }
        }
        que.offer(0);
        
        return abs(que.peek());

        // while largestX is not equal to peek element and length of array is

        // we want the largest two numbers to be polled and add the remainder to the stack 
        // for instance 2, 3, 6, 2, 4 it polls for 6 or 4 it inserts the remainder or 2, 3, 2, 2 
        
        // we poll for the two heaviest stones 
        // to condition when polling for policy if x < y then we pop x and insert y - x into the array
        // if x == y then both stones are destroyed 
    }

    public int abs(int a){
        return a >= 0 ? a : -a;
    }
}
