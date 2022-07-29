class CustomStack {
    int size ;    
    Stack<Integer> st;
    public CustomStack(int maxSize) {
        st = new Stack<>();
        size =maxSize;
    }
    
    public void push(int x) {
        if (st.size()>=size){
            return;
        }
        else {
            st.push(x);
        }
        return;
    }
    
    public int pop() {
        if (st.isEmpty()){
            return -1;
        }
        else {
            return st.pop();
        }
    }
    
    public void increment(int k, int val) {
        if (st.isEmpty()){
            return;
        }
        else {
            Stack<Integer> s2= new Stack();
            while (!st.isEmpty()){
                s2.push(st.pop());
            }
            while (!s2.isEmpty()){
                if (k>0){
                    st.push(s2.pop()+val);
                    k--;
                }
                else {
                    st.push(s2.pop());
                }
            }
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */