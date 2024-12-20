class Solution {
    public int maximumGain(String s, int x, int y) {
        Stack<Character> st= new Stack<>();

        int total=0;
        int max=-1;
        int min=-1;
        boolean ab= true;

        if (x>y){
            max=x;
            min=y;
        }
        else {
            max=y;
            min=x;
            ab= false;
        }
        for (char c : s.toCharArray()){
            if (ab){
                if (!st.isEmpty() &&st.peek()=='a' && c=='b'){
                    st.pop();
                    total+=max;
                }
                else
                    st.push(c);
            }
            else{
                if (!st.isEmpty() && st.peek()=='b' && c=='a'){
                    st.pop();
                    total+=max;
                }
                else
                    st.push(c);

            }
        }

        StringBuilder sb= new StringBuilder();
        while (!st.isEmpty()){
            sb.insert(0,st.pop());
        }

        s= sb.toString();

        System.out.println(s); 

        for (char c : s.toCharArray()){
            if (!ab){
                if (!st.isEmpty() && st.peek()=='a' && c=='b'){
                    st.pop();
                    total+=min;
                }
                else
                    st.push(c);
            }
            else{
                if (!st.isEmpty() && st.peek()=='b' && c=='a'){
                    st.pop();
                    total+=min;
                }
                else
                    st.push(c);

            }
        }

        return total;
    }
}