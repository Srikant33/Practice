class Solution {
    public int[][] generateMatrix(int n) {
        int count =1 ;
        int[][] ret= new int [n][n];
        int[][] visited= new int [n][n];
        int[] dir = new int []{0,1,2,3};
        int k=0;
        int i=0, j=-1;
        while (count <=n*n){
            k=k%4;
            if (k==0){
                j++;
                if (j>n-1 || visited[i][j]==1){
                    j--;
                    k++;
                    continue;
                }
                else {
                    ret[i][j]=count;
                    visited[i][j]=1;
                }
            }
            else if (k==1){
                i++;
                if (i>n-1 || visited[i][j]==1){
                    i--;
                    k++;
                    continue;
                }
                else {
                    ret[i][j]=count;
                    visited[i][j]=1;
                }
            }
            else if (k==2){
                j--;
                if (j<0 || visited[i][j]==1){
                    j++;
                    k++;
                    continue;
                }
                else {
                    ret[i][j]=count;
                    visited[i][j]=1;
                }                
            }
            else if (k==3){
                i--;
                if (i<0 || visited[i][j]==1){
                    i++;
                    k++;
                    continue;
                }
                else {
                    ret[i][j]=count;
                    visited[i][j]=1;
                }                
            }
            // System.out.println(count);
            count++;
        }
        return ret;
    }
}