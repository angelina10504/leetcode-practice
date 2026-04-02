class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
       int n=intervals.length, i=0;
        List<int[]> merged = new ArrayList<>();

        //case 1: no overlapping before merging intervals
        while(i<n && intervals[i][1]<newInterval[0]){
            merged.add(intervals[i]);
            i++;
        }

        //case 2: overlapping and merging intervals
        while(i<n && newInterval[1]>=intervals[i][0]){
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        merged.add(newInterval);

        //case 3: No overlapping after merging newInterval
        while(i<n){
            merged.add(intervals[i]);
            i++;
        }
        return merged.toArray(new int[merged.size()][]);
    }
}