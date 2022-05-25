class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ret= new StringBuilder();
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
            ret.append(word1.charAt(i));
            // System.out.println(ret[i]);
            ret.append(word2.charAt(i));
        }
        int pos= (2*s);
        while (m>s){
            ret.append(word1.charAt(s));
            pos++;
            s++;
        }
        while (n>s){
            ret.append(word2.charAt(s));
            pos++;
            s++;
        }
       
        return ret.toString();
    }
}