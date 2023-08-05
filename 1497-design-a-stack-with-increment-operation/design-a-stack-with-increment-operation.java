class CustomStack {
    ArrayList<Integer> l= new ArrayList<>();
    int max;
    public CustomStack(int maxSize) {
        max = maxSize;
    }
    
    public void push(int x) {
        if (l.size()<max){
            l.add(x);
        }
    }
    
    public int pop() {
        if (l.size()==0){
            return -1;
        }
        else {
            int val = l.get(l.size()-1);
            l.remove(l.size()-1);
            return val;
        }
    }
    
    public void increment(int k, int val) {
        for (int i=0; i<Math.min(k, l.size()); i++){
            l.set(i, l.get(i)+val);
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