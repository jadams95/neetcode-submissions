class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length - 1;
        System.out.println(r);
        int sum = 0;
        while(l < r){
            int area = min(heights[l], heights[r]) * (r - l);
            sum = max(sum, area);
            if(heights[l] <= heights[r]){
                l++;
            } else {
                r--;
            }
        }
       return sum;
    }
    public int min(int a, int b){
        return (a <= b) ? a : b;
    }

    public int max(int a, int b){
        return (a >= b) ? a : b;
    }

    // public int dfs(){}
}
