class CountSquares {

    private HashMap<Integer, Map<Integer, Integer>> grid;
    private int index;
    private int lftBndry = 1, rghtBndry = 1;

    public CountSquares() {
        // this.index = 0;
        // this.grid = new HashMap<Integer, int[][]>();
        // int[][] dp = new int[(x * y) / 4][2];
        // for(int i = 0; i < (100 * 10) / 4; i++){
        //     int len = dp[0].length;
        //     this.grid.put(i, new int[i][len]);
        // }

        grid = new HashMap<>();
    }
    
    public void add(int[] point) {
        int x = point[0], y = point[1];        
        // for(int[] possibilities : this.grid.values()){
        //             this.index++;            
        // }
        // ptsCount = new HashMap<>();
        grid.putIfAbsent(x, new HashMap<>());
        grid.get(x).put(y, grid.get(x).getOrDefault(y, 0) + 1);
    }
    
    public int count(int[] point) {
        // int i = 0;
        // int x = point[0];
        // int y = point[1];
        int res = 0, x1 = point[0], y1 = point[1];
        if(!grid.containsKey(x1)) return res;

        for(int y2 : grid.get(x1).keySet()){
            int side = y2 - y1;
            if(side == 0) continue;

            int x3 = x1 + side, x4 = x1 - side;


            // NEED TO SEE THIS IN PYTHON TUTOR
            res += grid.get(x1).get(y2) * 
            grid.getOrDefault(x3, new HashMap<>()).getOrDefault(y1, 0) *
            grid.getOrDefault(x3, new HashMap<>()).getOrDefault(y2, 0);
            

            res += grid.get(x1).get(y2) *
                   grid.getOrDefault(x4, new HashMap<>()).getOrDefault(y1, 0) *
                   grid.getOrDefault(x4, new HashMap<>()).getOrDefault(y2, 0);
        }        
        return res;


        // (x * y) * 4
        // Queue<int[]> points = new Queue<int[]>();
        
        
        // for(int y = 0; y < grid.size(); y++){
        //     // for(int[] points : grid.getOrDefault(y, 0)){
        //     //     System.out.println(Arrays.toString(points));
        //     // }
        // }
        // return 0;
    }
}
