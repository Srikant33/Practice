class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair<Character, Integer>> st = new Stack<>();
        for (char c : s.toCharArray()){
            if (st.isEmpty() || st.peek().getKey() != c){
                st.push(new Pair<>(c, 1));
            }
            else {
                int x = st.peek().getValue();
                st.pop();
                st.push(new Pair<>(c, x+1));
                if (st.peek().getValue() == k){
                    st.pop();
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()){
            char c = st.peek().getKey();
            int x =st.pop().getValue();
            
            for (int i =0; i<x ; i++){
                sb.insert(0, c);
            }
        }
        return sb.toString();
    }
}