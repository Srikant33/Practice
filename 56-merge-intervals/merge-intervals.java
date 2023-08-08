class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> l = new LinkedList<>();
        Arrays.sort(intervals, (a,b)-> a[0]- b[0]);
        int start = intervals[0][0], end = intervals[0][1];
        for (int[] interval: intervals){
            if (interval[0]<=end){
                end = Math.max(end, interval[1]);
            }
            else {
                l.add(new int[]{start, end});
                start =interval[0];
                end = interval[1];
            }
        }
        l.add(new int[]{start, end});
        
        return l.toArray(new int[l.size()][2]);
    }
}