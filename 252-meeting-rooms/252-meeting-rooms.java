class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        int end = 0;
        
        for (int[] i : intervals){
            if(i[0]<end){
                return false;
            }
            end = i[1];
        }
        
        return true;
    }
}