class Solution {
    public int prefixCount(String[] words, String pref) {
        int len = pref.length();
        int count =0;

        for (String word : words ){
            if (word.substring(0, Math.min(len, word.length())).equals(pref)){
                count++;
            }
        }

        return count;
        
    }
}