class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
       List<String> l = new LinkedList<>();
        List<String> ret = new LinkedList<>();
        for (int i =1; i<=s.length(); i++){
            if (wordDict.contains(s.substring(0,i))){
                if (i<s.length()){
                    l = wordBreak(s.substring(i, s.length()), wordDict);       
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
}