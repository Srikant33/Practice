class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String, Character> hm= new HashMap<String, Character>();
        String[] words= s.split(" ");
        if (words.length!=pattern.length())
            return false;
        for (int i=0;i<pattern.length();i++){
            if (hm.containsKey(words[i])){
                if (hm.get(words[i])!=pattern.charAt(i)){
                    return false;
                }
            }
            else {
                if (hm.containsValue(pattern.charAt(i))){
                    return false;
                } else 
                       hm.put(words[i], pattern.charAt(i));
            }
        }
        return true;
    }
}