class Solution {
    public int area(int[][] grid,int i, int j, int count){
        if (grid[i][j]==1){
            count++;
            grid[i][j]=0;
            int m=grid.length,n=grid[0].length;
            // System.out.println(i+""+j+""+count);
                    
            if (i+1<m) count=area(grid,i+1,j,count);
            if (i-1>-1) count=area(grid,i-1,j,count);
            if (j+1<n) count=area(grid,i,j+1,count);
            if (j-1>-1) count=area(grid,i,j-1,count);
        }
        //System.out.println(" ");
        return count;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int count=0,max=0;        
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (grid[i][j]==1){
                    //System.out.println(i+""+j);
                    count=area(grid,i,j,0);
                    if (count >max){
                        max=count;
                    }
                }
            }        
        }
        // for (int i=0;i<m;i++){
        //     for (int j=0;j<n;j++){
        //         // System.out.print (grid[i][j]+" ");
        //     }
        //     // System.out.println("");
        // }
        return max;
    }
}