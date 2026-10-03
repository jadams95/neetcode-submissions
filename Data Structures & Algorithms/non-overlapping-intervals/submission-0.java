class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int nonOverLappingCnt = 0;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int prevEnd = intervals[0][1];

        for(int i = 1; i < intervals.length; i++){
            int startInterval = intervals[i][0];
            int endInterval = intervals[i][1];

            // if it is non-overlapping then increase

            if(startInterval >= prevEnd){
                prevEnd = endInterval;
            } else {
                nonOverLappingCnt++;
                prevEnd = Math.min(endInterval, prevEnd);
            }
        }
        return nonOverLappingCnt;
    }
}
