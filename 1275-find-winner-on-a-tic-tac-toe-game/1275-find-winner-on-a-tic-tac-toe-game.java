class Solution {
    int board[][];
    public String tictactoe(int[][] moves) {
        board= new int [3][3];
        for (int i=0;i<3;i++){
            for (int j=0; j <3; j++){
                board[i][j]=0;
            }
        }
        for (int i=0; i< moves.length; i++){
            if (i%2==0){
                board[moves[i][0]][moves[i][1]]=1;
                if( rowCheck(moves[i][0], 1) ||
                    colCheck(moves[i][1], 1) ||
                    (moves[i][1]==moves[i][0] && dioganl(1)) ||
                    (moves[i][1]==3-moves[i][0]-1 && antiDiognal(1))
                  ){
                    // for (int k=0;k<3;k++){
                    //     for (int l=0; l <3; l++){
                    //         // System.out.println(board[k][l]);
                    //     }
                    // }
                    return "A";
                }

            }
            else {
                board[moves[i][0]][moves[i][1]]=2;
                if( rowCheck(moves[i][0], 2) ||
                    colCheck(moves[i][1], 2) ||
                    (moves[i][1]==moves[i][0] && dioganl(2)) ||
                    (moves[i][1]==3-moves[i][0]-1 && antiDiognal(2))
                  ){
                    // for (int k=0;k<3;k++){
                    //     for (int l=0; l <3; l++){
                    //         System.out.print(board[k][l]);
                    //     }
                    //     System.out.println();
                    // }
                    return "B";
                }
            }
            
        }
        if (moves.length<9){
            return "Pending";
        }
        // for (int k=0;k<3;k++){
        //                 for (int l=0; l <3; l++){
        //                     System.out.print(board[k][l]);
        //                 }
        //                 System.out.println();
        //             }
        return "Draw";
    }
    
    
    public boolean rowCheck(int row, int player){
        for (int i =0; i<3; i++){
            if (board[row][i]!= player){
                return false;
            }
        }
        return true;
    }
    
    public boolean colCheck(int col, int player){
        for (int i =0; i<3; i++){
            if (board[i][col]!= player){
                return false;
            }
        }
        return true;
    }
    public boolean dioganl(int player){
        for (int i =0; i<3; i++){
            if (board[i][i]!= player){
                return false;
            }
        }
        return true;
    }
    
    
    public boolean antiDiognal(int player){
        for (int i =0; i<3; i++){
            if (board[i][3-i-1]!= player){
                return false;
            }
        }
        return true;
    }
}