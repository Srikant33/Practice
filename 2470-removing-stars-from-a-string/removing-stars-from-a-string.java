class Solution {
    public String removeStars(String s) {
        // Stack and remove char that is before * 
        //Stack 
        Stack<Character> st= new Stack<>();

        //looping through the sting
        for (char c : s.toCharArray()){
            // remove leement to left if its a star
            if (c=='*'){
                st.pop();
            }
            //add char to stack 
            else {
                st.push(c);
            }
        }

        //make String from stack
        StringBuilder sb = new StringBuilder();  
        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        sb.reverse();

        return sb.toString();
    }
}