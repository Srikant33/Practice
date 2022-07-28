class Solution {
    public char[][] explore(char[][] grid ,int  i,int  j){
        if (i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j] == '0'){
            return grid;    
        }   
        else {
            grid[i][j]='0';
            grid= explore(grid, i+1, j);
            grid= explore(grid, i-1, j);
            grid= explore(grid, i, j+1);
            grid= explore(grid, i, j-1);
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