class Solution {
    public String mergeAlternately(String word1, String word2) {
        //String builder to merge strings 
        StringBuilder sb = new StringBuilder();

        //creeating a int that is the length of the shorter word 
        int shor = Math.min(word1.length(), word2.length());

        //parsing through the words till the shortest word
        for (int i=0; i<shor; i++){
            //adding from word 1 then 2
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        //adding all remaining chars from the longer word ...whciever is shorter will not contribute anything  
        sb.append(word1.substring(shor, word1.length()));
        sb.append(word2.substring(shor, word2.length()));

        //returning string
        return sb.toString();
    }
}