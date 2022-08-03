class Solution {
    public char[][] explore(char[][] grid ,int  i,int  j){
        if ( grid[i][j] == '0'){
            return grid;    
        }   
        else {
            grid[i][j]='0';
            if (i+1<grid.length)grid= explore(grid, i+1, j);
            if (i>=1)grid= explore(grid, i-1, j);
            if (j+1<grid[0].length)grid= explore(grid, i, j+1);
            if (j>=1)grid= explore(grid, i, j-1);
        }
        return grid;
    }
    
    public int numIslands(char[][] grid) {
        int count =0;
        
        for (int i=0;i<grid.length; i++){
            for (int j=0; j<grid[0].length; j++){
                if (grid[i][j] == '1'){
                    count++;
                    grid = explore(grid, i,j);
                }
            }
        }
        
        return count ;
    }
}