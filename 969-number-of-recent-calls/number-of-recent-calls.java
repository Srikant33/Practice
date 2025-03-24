class RecentCounter {
    //declairing global queue 
    Queue<Integer> q;

    //initialization 
    public RecentCounter() {
        q= new LinkedList<>();
    }
    
    public int ping(int t) {
        //add element
        q.add(t);
        
        // remove any that is older tham 3000 ms 
        while(!q.isEmpty() && q.peek()<t-3000){
            q.poll();
        }

        // return the number of elemnts in queue 
        return q.size();

        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */