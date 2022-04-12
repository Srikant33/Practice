class Solution {
    int m,n;
    public int check (int[][] board, int a, int b){
        int count =0;
        // System.out.println(a+" "+b+ " ");
        int x,y;
        for (int i=-1; i<2; i++){
            for (int j=-1; j<2; j++){
                
                x=a+i;
                y=b+j;
                if (x>=m || x<0 || y>=n || y<0 || (x==a) && (y==b) ){
                    continue;
                }
                if (board[x][y]==1){
                    count++;
                }
                // System.out.println(x+" "+y+ " "+ count);
            }
        }
        // System.out.println("");
        
        // System.out.println("");
        if (count < 2 || count >3){
            return 0;
        }
        else if (board[a][b]==0 && count == 3){
            return 1;
        }
        else if (board[a][b]==0 && count == 2){
            return 0;
        }
        else if (board[a][b]==1){
            return 1;
        }
        else{
            return -1;
        }
        
    }
    public void gameOfLife(int[][] board) {
        this.m= board.length;
        this.n= board[0].length;
        int res[][]= new int[m][n];
        for (int i=0; i<m ;i++){
            for (int j=0; j <n; j++){
                res[i][j]=check(board, i, j);
            }
        }
        for (int i=0; i<m ;i++){
            for (int j=0; j <n; j++){
                board[i][j]=res[i][j];
            }
        }
        
    }
}