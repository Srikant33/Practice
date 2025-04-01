class Solution {
    public String reverseWords(String s) {
        // make a string array of all the words
        Stack<String> words = new Stack<>(); 
        s= s.trim();
        StringBuilder sb = new StringBuilder();
        for (char c:s.toCharArray()){
            if (c== ' '){
                if (sb.length()>0){
                    words.push(sb.toString());
                    sb.setLength(0);
                }
                continue;
            }
            else{
                sb.append(c+"");
            }
        }

        //adding all the words back 
        while (!words.isEmpty()){
            sb.append(" "+words.pop());
        }
        //reverse it 
        return sb.toString();

        //return string 
    }
}