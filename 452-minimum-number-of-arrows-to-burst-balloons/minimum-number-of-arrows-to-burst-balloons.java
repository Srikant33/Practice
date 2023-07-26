class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b)-> Integer.compare(a[0],b[0]));
        if (points.length==0){
            return 0;
        }
        
        int upper = points[0][1];
        int count =1;
        for (int i=1; i<points.length; i++){
            if (points[i][0]<= upper){
                upper = Math.min(upper, points[i][1]);
            }
            else {
                count++;
                upper = points[i][1];
            }
        }

        return count;
    }
}