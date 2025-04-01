class Solution {
    public String reverseWords(String s) {
        // split into string array
        String[] words = s.trim().split("\\s+"); 
        // reverse
        StringBuilder sb = new StringBuilder(); 
        for (int i=words.length-1; i>=0; i--){
            sb.append(words[i]+ " ");
        }
        //return
        return sb.toString().trim();
    }
}