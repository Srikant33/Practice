class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp = new int[m][n];

        for (int j=0; j<n; j++){
            if (j==0){
                dp[0][j]=grid[0][0];
            }    
            else {
                dp[0][j]=dp[0][j-1]+grid[0][j];
            }
        }


        for (int i=0; i<m; i++){
            if (i==0){
                dp[i][0]=grid[0][0];
            }    
            else {
                dp[i][0]=dp[i-1][0]+grid[i][0];
            }
        }



        for (int i=1; i<grid.length; i++){
            for (int j=1; j<grid[0].length; j++){
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1])+grid[i][j];
            }
        }       


        // for (int i=0; i<grid.length; i++){
        //     for (int j=0; j<grid[0].length; j++){
        //         System.out.print(dp[i+1][j+1]+" ");
        //     }
        //     System.out.println();
        // }       

        return dp[dp.length-1][dp[0].length-1];
    }
}