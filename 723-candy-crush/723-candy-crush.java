class Solution {
    public int[][] candyCrush(int[][] board) {
        int r= board.length;
        int c= board[0].length;
        boolean change = false;
        // System.out.println(r +" "+c);
        
//         for (int i=0; i<r ; i++){
//             for (int j=0; j<c; j++){
//                 System.out.print(board[i][j]+" ");
//             }
//             System.out.println("");
//         }
//         System.out.println("");
        
//         System.out.println("");
        
//         System.out.println("");
        
        for (int i=0; i<r ; i++){
            for (int j=0; j<c-2; j++){
                int v = Math.abs(board[i][j]);
                if (Math.abs(board[i][j+1]) ==v && Math.abs(board[i][j+2]) ==v && v!=0){
                    board[i][j] =-v;
                    board[i][j+1] =-v;
                    board[i][j+2] =-v;
                    change =true;
                }
                
            }
        }
        
        for (int i=0; i<r-2 ;i++){
            for (int j=0; j<c; j++){
                int v = Math.abs(board[i][j]);
                if (Math.abs(board[i+1][j]) ==v && Math.abs(board[i+2][j]) ==v && v!=0){
                    board[i][j] =-v;
                    board[i+1][j] =-v;
                    board[i+2][j] =-v;
                    change =true;
                }
            }
        }
        
        for (int j=0; j<c ;j++){
            int i = r;
            int e = r-1;
            while (i>0){
                i--;
                if (board[i][j]>0 ){
                    if (i!=e){
                        board[e][j]= board[i][j];
                        board[i][j]= 0;
                        // change =true;
                    }                  
                    e--;
                }
                else{
                    board[i][j]=0;
                }
            }
        }
        
        return (change)?candyCrush(board) : board;
    }
}