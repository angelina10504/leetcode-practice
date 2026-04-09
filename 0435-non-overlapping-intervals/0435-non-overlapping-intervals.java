class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[1],b[1]));
        int overlap=0;
        int prev_end = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(prev_end>intervals[i][0]){
                overlap++;
            }else{
                prev_end=intervals[i][1];
            }
        }
        return overlap;
    }
}