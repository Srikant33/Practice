class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack <Character> st1= new Stack<>();
        Stack <Character> st2= new Stack<>();
        for (char c : s.toCharArray()){
            if (c=='#'){
                if (st1.isEmpty()){
                    continue;
                } 
                st1.pop(); 
            }
            else{ 
                st1.push(c); 
            } 
        } 
        for (char c : t.toCharArray()){ 
            if (c=='#'){ 
                if (st2.isEmpty()){
                    continue;
                }
                st2.pop(); 
            }
            else{ st2.push(c); }
        }
        while (!st1.isEmpty() || !st2.isEmpty()){ 
            // System.out.println(st1.peek()+"" +st2.peek()); 
            if (st1.isEmpty() || st2.isEmpty() || st1.pop()!=st2.pop()){
                return false; 
            }
        } 
        return true;
    }
}