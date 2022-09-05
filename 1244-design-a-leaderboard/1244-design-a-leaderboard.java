class Leaderboard {
    HashMap <Integer, Integer> hm;
    public Leaderboard() {
        hm = new HashMap<>();
    }
    
    public void addScore(int playerId, int score) {
        hm.put(playerId, hm.getOrDefault(playerId, 0)+score);
    }
    
    public int top(int K) {
        PriorityQueue <Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(K, (a,b)-> b.getValue()-a.getValue());
        for (Map.Entry<Integer, Integer> e: hm.entrySet()){
            pq.add(e);
        }
        int sum =0;
        for (int i=0; i<K; i++){
            int temp= pq.poll().getValue();
            sum+= temp;
        }
        return sum;
    }
    
    public void reset(int playerId) {
        hm.put(playerId,0);
    }
}

/**
 * Your Leaderboard object will be instantiated and called as such:
 * Leaderboard obj = new Leaderboard();
 * obj.addScore(playerId,score);
 * int param_2 = obj.top(K);
 * obj.reset(playerId);
 */