class Solution {
    public char[][] helper(char [][] grid, int i, int j){
        if (i>=grid.length|| i<0|| j>=grid[0].length || j<0 || grid[i][j]=='0'){
            return grid;
        }
        grid[i][j]='0';
        grid = helper (grid, i+1, j);
        grid = helper (grid, i-1 , j);
        grid = helper (grid, i , j+1);        
        grid = helper (grid, i , j-1);
        return grid;
    }

    public int numIslands(char[][] grid) {
        int count =0;

        for (int i=0; i<grid.length; i++){
            for (int j=0; j<grid[0].length; j++){
                if (grid[i][j]=='1'){
                    grid = helper(grid, i, j);
                    count++;
                }
            }
        }

        return count;
    }
}