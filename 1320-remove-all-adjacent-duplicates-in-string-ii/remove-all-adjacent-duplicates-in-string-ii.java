class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair<Character, Integer>>  st = new Stack<>();

        for (char c : s.toCharArray()){
            if (st.isEmpty() || st.peek().getKey()!=c){
                st.push(new Pair(c,1));
            }
            else{
                st.push(new Pair(c , st.pop().getValue()+1));
            }

            if (st.peek().getValue()==k){
                st.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            for (int i=0; i<st.peek().getValue(); i++){
                sb.insert(0, st.peek().getKey());
            }
            st.pop();
        }

        return sb.toString();
    }
}