class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
        int down= intervals[0][0];
        int up = intervals[0][1];
        List<int[]> l= new LinkedList<>();

        for (int[] interval: intervals ){
            if (interval[0]<= up){
                up = Math.max(up, interval[1]);
            }

            else {
                l.add(new int[]{down, up});
                down = interval[0];
                up = interval[1];
            }
        }
        l.add(new int[]{down, up});

        return l.toArray(new int[l.size()][2]);
            
    }
}