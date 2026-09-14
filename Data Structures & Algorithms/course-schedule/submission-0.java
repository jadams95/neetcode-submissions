class Solution {
    // very similar to groupAnagrams
    private Map<Integer, List<Integer>> preMap = new HashMap<>();
    private Set<Integer> visiting = new HashSet<>();


    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for(int i = 0; i < numCourses; i++){
            preMap.put(i, new ArrayList<>());
        }
        for(int[] prereq:prerequisites){
            preMap.get(prereq[0]).add(prereq[1]);
        }

        for(int c = 0; c < numCourses; c++){
            if(!dfs(c)){
                return false;
            }
        }
        // the number of unique pairs of requist x = prerequists[x][numOfCourses]
        // [][]int prerequists = new int[][numCOurses]
        //    boolean prequests = dfs(numCourses, prerequisites, false, 0);
           return true;
    }

    public boolean dfs(int crs){

        if(visiting.contains(crs)){
            return false;
        }
        // add unique rule 
        if(preMap.get(crs).isEmpty()){
            return true;
        }
        preMap.keySet().stream().forEach(System.out::println);
        System.out.println(preMap.values());
        visiting.add(crs);

        for(int pre:preMap.get(crs)){
            if(!dfs(pre)){
                return false;
            }
        }
        visiting.remove(crs);
        preMap.put(crs, new ArrayList<>());
        return true;



    }
}
