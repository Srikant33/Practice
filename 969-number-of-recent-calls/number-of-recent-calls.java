class RecentCounter {
    //declairing global queue 
    Queue<Integer> q;
    //setting global size
    int size=0;

    //initialization 
    public RecentCounter() {
        q= new LinkedList<>();
    }
    
    public int ping(int t) {
        //add element
        q.add(t);
        size++;
        
        // remove any that is older tham 3000 ms 
        while(q.peek()<t-3000){
            q.remove();
            size--;
        }

        // return the number of elemnts in queue 
        return size;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */