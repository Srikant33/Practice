class Solution {
    public boolean isValid(String s) {
        HashMap <Character, Character> map=new HashMap <Character, Character>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        Stack <Character> st= new Stack <Character>();
        for (int i=0;i<s.length();i++){
            if (!st.empty() && st.peek()==map.get(s.charAt(i))){
                System.out.println(s.charAt(i));
                st.pop();
            }
            else{ 
                System.out.println(s.charAt(i));
                st.push(s.charAt(i));
            }
        }
        //System.out.println(st.peek());
        if (st.empty())
            return true;
        else
            return false;
    }
}