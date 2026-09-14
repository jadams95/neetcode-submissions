class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        // List<String> List of Two for Source and Destination
        // Map<Node 1 Integer, List<String>>
        //     Node 2 Integer, Dest from List Node 1 to Destination

        // Got the Overall Data Structure generally right
        //  but missed interal with a Key Hashed String
        // Map<Node 1 String, List<String>>
        //     Node 2 String, Dest from List Node 1 to Destination


        Map<String, PriorityQueue<String>> adj = new HashMap<>();
        
        for(List<String> ticket : tickets){
            String src = ticket.get(0);
            String dst = ticket.get(1);
            adj.computeIfAbsent(src, k -> new PriorityQueue<>()).offer(dst);
        } 

        List<String> res = new ArrayList<>();

        dfs(adj, "JFK", res);

        Collections.reverse(res);

    //     for(int i = 0; i < res2.length; i++){
    //         res2[i] = new ArrayList<>(1);
    //     }
        
    //     // Cycling with Priority with one ticket exactly once Lexical Order
    //    System.out.println(Arrays.toString(res2));


        

    //     List<String> res = new ArrayList<>(tickets.size() + 1);
    //     PriorityQueue<String> pq = new PriorityQueue<String>();
    //     for(List<String> ticket: tickets){
    //         for(String x : ticket){
    //             System.out.println(x);
    //             if(x.equals("JFK")){
    //                 res.add(0, x);
    //             }
    //         }
    //     }



    //     System.out.println(res);
        return res;        
    }


    private void dfs(Map<String, PriorityQueue<String>> adj, String src, List<String> res){
        PriorityQueue<String> queue = adj.get(src);
        while(queue != null && !queue.isEmpty()){
            String dst = queue.poll();
            dfs(adj, dst, res);
        }
        res.add(src);
    }
}
