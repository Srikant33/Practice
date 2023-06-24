class Solution {
    public String helper( String s, int n){
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n ;i++){
            sb.append(s);
        }
        return sb.toString();
    }
    public String decodeString(String s) {
        Stack<String> st = new Stack<>();

        StringBuilder word = new StringBuilder();
        StringBuilder num = new StringBuilder();

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == ']'){
                while (!st.peek().equals("[")){
                    word.insert(0, st.pop());
                }
                st.pop();
                // System.out.println(st.peek());
                while (!st.isEmpty() && st.peek().matches("[0-9]+")){
                    num.insert(0, st.pop());
                }
                // System.out.println(word+ " "+num);
                st.push(helper (word.toString(), Integer.valueOf(num.toString())));

                word.setLength(0);
                num.setLength(0);
            }
            else {
                st.push(s.charAt(i)+"");
            }
        }

        StringBuilder res = new StringBuilder();
        while (!st.isEmpty()){
            res.insert(0, st.pop());
        }

        return res.toString();
    }
}