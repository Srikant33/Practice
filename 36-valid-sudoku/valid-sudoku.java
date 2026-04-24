class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = 9;
        //checking rows
        for (int i=0; i<n; i++ ){
            HashSet<Character> hs = new HashSet<>();
            for (int j=0; j<n; j++){
                if (board[i][j]=='.'){
                    continue;
                }
                else {
                    if (hs.contains(board[i][j])){
                        System.out.println("row");
                        return false;
                    }
                    else{
                        hs.add(board[i][j]);
                    }
                }
            }
        }
        //checking cols
        for (int j=0; j<n; j++ ){
            HashSet<Character> hs = new HashSet<>();
            for (int i=0; i<n; i++){
                if (board[i][j]=='.'){
                    continue;
                }
                else {
                    if (hs.contains(board[i][j])){
                        System.out.println("col");
                        return false;
                    }
                    else{
                        hs.add(board[i][j]);
                    }
                }
            }
        } 
        
        //checking box
        for (int x=0; x<3; x++){
            for (int y=0; y<3; y++){
                HashSet<Character> hs = new HashSet<>();
                for (int i=x*3; i<(x+1)*3; i++){
                    for (int j=y*3; j<(y+1)*3; j++){
                        if (board[i][j]=='.'){
                            continue;
                        }
                        else if (hs.contains(board[i][j])){
                            System.out.println("box"+i+" "+j);
                            return false;
                        }
                        else{
                            hs.add(board[i][j]);
                        }
                    }
                }
            }
        }

        return true;
    }
}