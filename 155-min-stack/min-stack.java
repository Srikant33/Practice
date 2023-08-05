class MinStack {
    LinkedList<Pair<Integer, Integer>> l;
    public MinStack() {
        l = new LinkedList<>();
    }
    
    public void push(int val) {
        if (l.size()==0){
            l.addFirst(new Pair<>(val, val));
        }
        else{
            l.addFirst(new Pair<>(val, Math.min(getMin(), val)));
        }
    }
    
    public void pop() {
        l.removeFirst();
    }
    
    public int top() {
        return l.peekFirst().getKey();
    }
    
    public int getMin() {
        return l.peekFirst().getValue();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */