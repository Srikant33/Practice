class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();

        String[] dirs = path.split("/");

        for (String s : dirs){
            if (s.length()<1 || s.equals(".")){
                continue;
            }
            else if (s.equals("..")){
                if (st.isEmpty()){
                    continue;
                }
                st.pop();
            }
            else {
                st.push(s);
            }
        }
        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()){
            sb.insert(0,"/"+st.pop());
        }

        if (sb.length()==0){
            sb.append("/");
        }

        return sb.toString();
    }
}