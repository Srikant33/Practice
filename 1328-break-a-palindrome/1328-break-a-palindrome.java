class Solution {
    public String breakPalindrome(String palindrome) {
        StringBuilder sb = new StringBuilder(palindrome);
        
        boolean change = false;
        for (int i=0; i<palindrome.length()/2; i++){
            if (palindrome.charAt(i)!='a'){
                change=true; 
                sb.setCharAt(i, 'a');
                break;
            }    
        }
        
        if (palindrome.length()>1 && !change){
            change=!change;
            sb.setCharAt(palindrome.length()-1, 'b');
        }
        
        if (!change){
            return "";
        }
        else {
            return sb.toString();
        }
    }
}