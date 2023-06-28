class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> a[0]- b[0]);
        List<int[]> l = new ArrayList<>();
        int min=intervals[0][0], max=intervals[0][1];
        for (int[] i: intervals){
            if (i[0]<=max){
                max = Math.max(i[1], max);
            }
            else{
                l.add(new int[]{min, max});
                min = i[0];
                max = i[1];
            }
        }
        l.add(new int[]{min, max});

        return l.toArray(new int[l.size()][2]);
    }
}