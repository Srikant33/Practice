class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int a=0, b=0;
        for (String s: tokens){
            if (s.equals("+") ||s.equals("-")||s.equals("*")||s.equals("/")){
                b= st.pop();
                a= st.pop();
                
                if (s.equals("+")){
                    st.push(a+b);
                }
                else if (s.equals("-")){
                    st.push(a-b);
                }
                else if (s.equals("*")){
                    st.push(a*b);
                }
                else if (s.equals("/")){
                    st.push(a/b);
                }
            }
            else {
                st.push(Integer.parseInt(s));
            }
        }

        return st.pop();
    }
}