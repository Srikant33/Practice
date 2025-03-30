class Solution {
    public String gcdOfStrings(String str1, String str2) {
        //finding if both will have a common divisor 
        if (!(str1+str2).equals(str2+str1)){
            return "";
        }

        /// if they do longest string that divides will be the answer 
        // min length string 
        int min = Math.min (str1.length(), str2.length());
        int res=0;
        // looping through all possible subfactors 
        for ( int i=1; i<=min; i++){
            if (str1.length()%i==0 && str2.length()%i==0){
                res = i;
            }
        }

        return str1.substring(0,res);
    }
}