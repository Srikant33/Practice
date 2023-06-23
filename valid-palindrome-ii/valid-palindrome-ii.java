class Solution {
    public boolean helper(String t1, String t2){
        String s = t1+t2;
        for (int i=0; i<s.length()/2; i++){
            if (s.charAt(i)!= s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        if (helper(s.substring(0,1), s.substring(1,s.length()))){
            return true;
        }
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)!= s.charAt(s.length()-1-i)){
                return helper(s.substring(0,i), s.substring(i+1,s.length()))|| helper(s.substring(0,s.length()-1-i), s.substring(s.length()-i,s.length()));
            }
        }    
        return false;
    }
}