class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
         Arrays.sort(intervals, (a, b) -> a[0]-b[0]);
        int count =0;
        int prev = intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0] < prev)
            {
                count++;
                prev = Math.min(intervals[i][1],prev);
            }
            else
            prev = intervals[i][1];
        }
        return count;
    }
}