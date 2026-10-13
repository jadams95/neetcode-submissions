class Solution {
    public int leastInterval(char[] tasks, int n) {

        // HashMap<Character, Integer> taskMap = new HashMap<>();
        int[] table = new int[26];
        // Queue priority of A->B->C as it grows to Z or the next task

        for(char x: tasks){
            table[x - 'A']++;
        }

        // transforms it to a Max-Heap by default its a Min-Heap
        PriorityQueue<Integer> pque = new PriorityQueue<>(Collections.reverseOrder());


        for(int cnt:table){
            if(cnt > 0){
                pque.add(cnt);
            }
        }
        
        int time = 0;
        Queue<int[]> q = new LinkedList<>();

        while(!pque.isEmpty() || !q.isEmpty()){
            time++;
            if(pque.isEmpty()){
                time = q.peek()[1];
            } else {
                int cnt = pque.poll() - 1;
                if(cnt > 0){
                    q.add(new int[]{cnt, time + n});
                }
            }

            if(!q.isEmpty() && q.peek()[1] == time){
                pque.add(q.poll()[0]);
            }
        }


        // never needed tasks.length
        // int y = tasks.length;
        
        





        // minimum number of CPU cycles required to complete all tasks

        // tasks[i] >= 'A' || tasks[i] <= 'Z'

        // n is the seperated by at least n CPU cycles to cooldown the CPU 
        
        // return the minimun number of CPU cycles required to complete all tasks

        return time;    
    }
}
