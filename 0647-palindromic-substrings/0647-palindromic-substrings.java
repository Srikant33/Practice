class Solution {
    public boolean palindrome (String s){
        StringBuilder sb = new StringBuilder(s);
        String rev = sb.reverse().toString();
        return s.equals(rev);
    }
    
    public int countSubstrings(String s) {
        int count =0;
        for (int i =0; i<s.length(); i++){
            for (int j=i+1; j<s.length()+1; j++){
                if (palindrome(s.substring(i,j))){
                    count++;
                }    
            }
        }
        return count;
    }
}