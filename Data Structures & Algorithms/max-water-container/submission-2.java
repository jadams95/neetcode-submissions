class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length - 1;
        int maxNum = 0;
        while(l < r){
            int area = min(heights[l], heights[r]) * (r - l);
            maxNum = max(maxNum, area);
            if(heights[l] <= heights[r]){
                l++;
            } else {
                r--;
            }
        }
        return maxNum;
    }

    public int min(int a, int b){
        return (a <= b) ? a : b;
    }

    public int max(int a, int b){
        return (a >= b) ? a : b;
    }
}
