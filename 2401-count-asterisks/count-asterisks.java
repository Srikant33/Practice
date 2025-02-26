class Solution {
    public int countAsterisks(String s) {
        boolean read=true;
        int count =0;

        for (char c: s.toCharArray()){
            if (read){
                if (c=='*'){
                    count++;
                }
            }
            if (c=='|'){
                read=!read;
            }
        }

        return count;
    }
}