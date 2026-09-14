/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        boolean canAttendAll = false;
        Collections.sort(intervals, Comparator.comparingInt(i -> i.start));
        int l = 0;
        // need to sort the Interval times 
        // arr swap position if i2 is before i1
        for(int a = l + 1; a < intervals.size(); a++){
            Interval i1 = intervals.get(a - 1);
            Interval i2 = intervals.get(a);

            if(i1.end > i2.start){
                return false;
            }
        }
        return true;
    }
}
