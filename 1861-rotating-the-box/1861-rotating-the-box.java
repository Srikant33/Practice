class Solution {
    public char[][] rotateTheBox(char[][] box) {
        char[][] rotated= new char[box[0].length][box.length];
        for (int i=0; i<box.length; i++){
            for (int j=0; j<box[0].length; j++){
                rotated[j][box.length -1 -i] = box[i][ j];
            }
        }
//         }for (int i=0; i<box.length; i++){
//             for (int j=0; j<box[0].length; j++){
//                 System.out.println()
//             }
//         }
        
        int empty = Integer.MIN_VALUE;
        for (int i=0; i<rotated[0].length; i++){
            empty = Integer.MIN_VALUE;
            for (int j=rotated.length-1 ; j>=0; j--){
                if (rotated[j][i] == '.'){
                    empty = Math.max(empty , j);
                }
                else if (rotated[j][i] == '*'){
                    empty = Integer.MIN_VALUE;
                }
                else if (rotated[j][i] == '#' && empty > Integer.MIN_VALUE){
                    rotated[empty][i] = '#';
                    rotated[j][i]='.';
                    empty--;
                    // System.out.println("*");
                }
            }
        }
        return rotated;
    }
}