class CustomStack {
    int[] st ;
    int pos;
    int max;
    public CustomStack(int maxSize) {
        st = new int[maxSize];
        pos=-1;
        max =maxSize;
    }
    
    public void push(int x) {
        if (pos+1<max){
            pos++;
            st[pos]=x;
        }
    }
    
    public int pop() {
        if (pos>=0){
            return st[pos--];
        }
        else {
            return -1;
        }
    }
    
    public void increment(int k, int val) {
        for (int i=0; i<k && i<max; i++){
            st[i]+=val;
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