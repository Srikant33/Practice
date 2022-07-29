class CustomStack {
    LinkedList<Integer> l;
    int max;
    public CustomStack(int maxSize) {
        l = new LinkedList<Integer>();
        max=maxSize;
    }
    
    public void push(int x) {
        if (l.size()<max){
            l.add(x);
        }
    }
    
    public int pop() {
        if (l.isEmpty()){
            return -1;
        }
        return l.removeLast();
    }
    
    public void increment(int k, int val) {
        for (int i=0; i< l.size(); i++){
            if( k>0){
                l.set(i, l.get(i)+val);
                k--;
            }
            else {
                break;
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