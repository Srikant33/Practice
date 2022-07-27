class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0, r= matrix.length-1 , m=0;
        int row=0;
        
        while(l<=r){
            m= l+ (r-l)/2;
            if ((m == matrix.length-1 )|| (matrix[m+1][0]>target && matrix[m][0]<=target)){
                row=m; 
                break;
            }
            else if (target < matrix[m][0]){
                r = m-1;
            }
            else{
                l=m+1;
            }
            // System.out.println(m);
        }

        l=0;
        r=matrix[0].length-1;

        while(l<=r){
            m= l+ (r-l)/2;
            if (matrix[row][m]==target){
                return true;
            }
            else if (matrix[row][m] < target){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        
        return false;    
    }
}