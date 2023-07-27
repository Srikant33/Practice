class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1){
            return s;
        }
        StringBuilder[] sb = new StringBuilder[numRows];

        for (int i=0; i<numRows ;i++){
            sb[i]= new StringBuilder();
        }

        int row =0;
        boolean down = true;
        for (int i=0; i<s.length(); i++){
            if (row >= numRows){
                down=!down;
                row-=2;
            }
            else if (row < 0){
                down=!down;
                row+=2;
            }
            System.out.println(row);
            sb[row].append(s.charAt(i));
            if (down){
                row++;
            }
            else {
                row--;
            }
            
            
        }

        StringBuilder ret= new StringBuilder();
        for (StringBuilder a: sb){
            ret.append(a);
        }

        return ret.toString();
    }
}