class Solution {
    public boolean helper(String s, HashSet<String> hs, String original){
        if (s.equals("")){
            return true;
        }
        // System.out.print(" "+s);
        for (int i=1; i<s.length(); i++){
            if (hs.contains(s.substring(0,i)) && !s.substring(0,i).equals(original) && (helper(s.substring(i, s.length()), hs, original) || hs.contains(s.substring(i,s.length())))){
                return true;
            }
        }
        
        return false;
    }
    
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        HashSet<String> hs = new HashSet<>();
        
        for (String word: words){
            hs.add(word);
        }
        
        List<String> ret = new LinkedList<>();
        for (String word:words){
            // System.out.println(word);
            if (helper (word, hs , word)){
                ret.add(word);
            }
            // System.out.println(" -------------- ");

        }
        
        return ret;
    }
}