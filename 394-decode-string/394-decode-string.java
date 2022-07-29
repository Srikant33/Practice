class Solution {
    public String multi(String s, int x){
        StringBuilder sb = new StringBuilder();
        // System.out.println(s+ " "+x );
        while (x!=0){
            sb=sb.append(s);
            x--;
        }
        return sb.toString();
    }
    public String decodeString(String s) {
        StringBuilder sbb= new StringBuilder();
        StringBuilder num= new StringBuilder();
        
        Stack<String> st = new Stack<>();
        
        for (char c: s.toCharArray()){
            if (c == ']'){
                sbb= new StringBuilder();
                num=new StringBuilder();
                while(!st.peek().equals("[")){
                    sbb.insert(0,st.pop());
                }
                st.pop();
                while(!st.isEmpty() && st.peek().matches("[0-9]+")){
                    num.insert(0,st.pop());
                }
                st.push(multi(sbb.toString(), Integer.parseInt(num.toString())));
            }
            else {
                st.push(c+"");
            }
        }
        
        sbb= new StringBuilder();
        while(!st.isEmpty()){
            sbb.insert(0,st.pop());
        }
        
        return sbb.toString();
    }
}