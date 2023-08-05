class MyQueue {
    Stack<Integer> st;
    Stack<Integer> rev;
    
    public void transfer(Stack<Integer> from, Stack<Integer> to){
        while (!from.isEmpty()){
            to.push(from.pop());
        }
    }

    public MyQueue() {
        st = new Stack<>();
        rev = new Stack<>();
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        transfer(st, rev);
        int val = rev.pop();
        transfer(rev, st);
        return val;
    }
    
    public int peek() {
        transfer(st, rev);
        int val = rev.peek();
        transfer(rev, st);
        return val;
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */