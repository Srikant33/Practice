class Solution {
    public String gcdOfStrings(String str1, String str2) {
        //finding if both will have a common divisor 
        if (!(str1+str2).equals(str2+str1)){
            return "";
        }

        /// if they do longest string that divides will be the answer 
        // min length string 
        int l1 = str1.length();
        int l2 = str2.length();
        int min = Math.min (l1, l2);
        int res=0;
        

        // looping through all possible subfactors 
        for ( int i=1; i<=min; i++){
            if (l1%i==0 && l2%i==0){
                res = i;
            }
        }

        return str1.substring(0,res);
    }
}