class Solution {
    public String gcdOfStrings(String str1, String str2) {
        //shorter string 
        String s = str1.length()>str2.length()?str2:str1;
        //malke a substring lenght that is a divisor
        int max= 0;

        // looping through prefix
        for (int i =0; i<=s.length(); i++){
            // make copy of string 1 and 2 to replace 
            String s1= str1;
            String s2= str2;
            
            
            //replace prefix substring with blank  
            s1=s1.replace(s.substring(0,i),"");
            s2=s2.replace(s.substring(0,i),"");

            // System.out.println(s1);
            //if lenghgt of both is 0 ists a common denominator 
            if (s1.length()==0 && s2.length()==0){
                max = i;
            }
        }

        //return string that is divisor
        return s.substring(0,max);
    }
}