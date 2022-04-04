class Solution {
    public boolean pal(String s, int a, int b){
        for (int i=a; i<=(b+a)/2; i++){
            if (s.charAt(i)!= s.charAt(b+a-i)){
                return false;
            }
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        for (int i=0;i<s.length()/2;i++){
            if (s.charAt(i)==s.charAt(s.length()-i-1)){
                i=i;
            }
            else{
                if (pal(s,i,s.length()-i-2) || pal(s,i+1,s.length()-i-1)){
                    return true;
                }
                else{
                    return false;
                }
            } 
        }
        return true;
    }
}