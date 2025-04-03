class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0){
            return true;
        }
        else if (s.length()>t.length()){
            return false;
        }
        // 2 poiinter 
        int sub=0;        

        //irtate string t and find all of s
        for(char c: t.toCharArray()){
            if (c== s.charAt(sub)){
                sub++;
                // all of then are found 
                if (sub == s.length()){
                    return true;
                }
            }
        }

        // if not found 
        return false;
    }
}