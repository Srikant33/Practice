class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] ret= new char[word1.length()+word2.length()];
        int m=word1.length();
        int n=word2.length();
        int s;
        if (m<n){
            s=m;
        }
        else{
            s=n;
        }
        for (int i=0; i<s; i++){
            // System.out.println(ret[0]);
            ret[2*i]=word1.charAt(i);
            // System.out.println(ret[i]);
            ret[(2*i)+1]= word2.charAt(i);
        }
        int pos= (2*s);
        while (m>s){
            ret[pos]=word1.charAt(s);
            pos++;
            s++;
        }
        while (n>s){
            ret[pos]=word2.charAt(s);
            pos++;
            s++;
        }
       
        return String.valueOf(ret);
    }
}