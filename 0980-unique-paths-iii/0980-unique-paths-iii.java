class Solution {
    int m, n, total=0;
    int[] end= new int[2];
    int ans =0;
    
    public void helper (int[][] grid, int i, int j, int count){
        if (i<0 || i>=m || j<0 || j>=n || grid[i][j] == -1){
            return;
        }
        
        
        if (grid[i][j] == grid[end[0]][end[1]] && count == total){
            ans++;
            return;
        }
        grid[i][j] =-1;
        helper (grid, i+1 , j, count+1);
        helper (grid, i-1 , j, count+1); 
        helper (grid, i , j+1, count+1);
        helper (grid, i , j-1, count+1);
        grid[i][j] = 0;

        return;
    }
    
    
    public int uniquePathsIII(int[][] grid) {
        m= grid.length;
        n= grid[0].length;
        
        int[] start = new int[2];
        
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if (grid[i][j]!=-1 ){
                    total++;
                    if (grid[i][j] == 2){
                        end[0]=i;
                        end[1]=j;
                    }
                    else if (grid[i][j] ==1){
                        start[0] = i;
                        start[1]= j;
                    }
                }
            }
        }
        
        helper (grid, start[0], start[1], 1);
        return ans;
    }
}