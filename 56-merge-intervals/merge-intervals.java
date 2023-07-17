class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
        List<int[]> l= new ArrayList<>();

        for (int[] interval: intervals ){
            if (!l.isEmpty() && interval[0]<= l.get(l.size()-1)[1] ){
                l.set(l.size()-1, new int[]{l.get(l.size()-1)[0], Math.max(l.get(l.size()-1)[1], interval[1])});
            }

            else {
                    l.add(new int[]{interval[0], interval[1]}); 
                }
        }


        return l.toArray(new int[l.size()][2]);
            
    }
}