class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        Arrays.sort(ranges, (a,b)-> a[0]-b[0]);
        List<List<Integer>> ll= new LinkedList<>();
        int start = ranges[0][0];
        int end = ranges[0][1];
        

        for (int i =1; i<ranges.length; i++){
            if (end>=ranges[i][0]-1){
                end = Math.max(end,ranges[i][1]);
            }
            else {
                List<Integer> l = new LinkedList<>();
                l.add(start);
                l.add(end);
                ll.add(l);
                start= ranges[i][0];
                end= ranges[i][1];
            }
        }
        List<Integer> l = new LinkedList<>();
        l.add(start);
        l.add(end);
        ll.add(l);

        for (int i=0; i<ll.size(); i++){
            // System.out.println(ll.get(i).get(0)+" "+ll.get(i).get(1));
            if (left>=ll.get(i).get(0) && right<=ll.get(i).get(1)){
                return true;
            }
        }

        return false;

    }
}