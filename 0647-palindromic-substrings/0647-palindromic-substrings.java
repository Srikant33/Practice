class Solution {
    public boolean palindrome (String s){
        for (int i=0; i<s.length()/2; i++){
            if (s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
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