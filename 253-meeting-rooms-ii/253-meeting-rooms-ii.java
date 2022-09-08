class Solution {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int min=Integer.MAX_VALUE,count =0;
        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)-> a-b);
        
        for (int[] i: intervals){
            if (pq.isEmpty() || i[0]<pq.peek()){
                count++;            
                pq.add(i[1]);
            }
            else {
                pq.poll();
                pq.add(i[1]); 
            }
        }
        
        return count;
    }
}