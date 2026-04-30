class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        for (int i=0; i<mat.length; i++){
            for (int j=0; j<mat[0].length; j++){
                if (i%2==0){               
                    if (mat[i][j]!= mat[i][(mat[0].length+j-(k%mat[0].length))%mat[0].length]){
                        return false;
                    }
                }
                else {
                    if (mat[i][j]!= mat[i][(mat[0].length+j+k)%mat[0].length]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}