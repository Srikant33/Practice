class Solution {
    public int balancedStringSplit(String s) {
        int prev = 0, count =0;
        for (char c: s.toCharArray()){
            if (c == 'L'){
                prev++;
            }
            else {
                prev--;
            }
            if (prev==0){
                count++;
            } 
        }

        return count;

    }
}