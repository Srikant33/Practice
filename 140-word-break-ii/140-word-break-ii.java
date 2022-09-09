class Solution {
    public List<String> helper (String s, List<String> wordDict){
        
        List<String> l = new LinkedList<>();
       
        List<String> ret = new LinkedList<>();
        
        for (int i =1; i<=s.length(); i++){
            if (wordDict.contains(s.substring(0,i))){
                if (i<s.length()){
                    l = helper(s.substring(i, s.length()), wordDict);
                    // System.out.println(l);
                    
                    for (String str: l){
                        
                        ret.add(s.substring(0,i)+" "+str);
                    }
                }
                else{
                    ret.add(s.substring(0,i));
                }
            }
        }
        

        return ret;
    }
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> l = helper (s, wordDict);
        // List<String> ret = new LinkedList<>();
        // System.out.println(l);
        // for (String str: l){
        //     int count = 0;
        //     for (char c: str.toCharArray()){
        //         if (c!=' '){
        //             count++;
        //         }
        //     }
        //     if (count == s.length()){
        //         ret.add(str);
        //     }
        // }
        return l;
    }
}