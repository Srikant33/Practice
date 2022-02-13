class MyQueue {
    
    
        Stack <Integer> st=new Stack<Integer>();
        Stack <Integer> queue=new Stack<Integer>();
    
    public MyQueue() {
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        queue.clear();
        while(!st.empty()){
            queue.push(st.pop());
        }
        int ret= queue.pop();
        while(!queue.empty()){
            st.push(queue.pop());
        }
        return ret;
    }
    
    public int peek() {
        queue.clear();
        while(!st.empty()){
            queue.push(st.pop());
        }
        int ret= queue.peek();
        while(!queue.empty()){
            st.push(queue.pop());
        }
        return ret;
    }
    
    public boolean empty() {
        return st.empty();
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