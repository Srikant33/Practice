class Solution {
    public int twoCitySchedCost(int[][] costs) {
        PriorityQueue <Pair<Integer, Integer>> pq = new PriorityQueue<>((a,b) -> (a.getValue()-a.getKey()) - (b.getValue()-b.getKey()));
        for (int[] c : costs){
            pq.add(new Pair<>(c[0],c[1]));
        }
        int count = costs.length/2;
        int sum =0;
        while (!pq.isEmpty()){
            if (count > 0){
                sum+=pq.poll().getValue();
            }
            else{
                sum+=pq.poll().getKey();
            }
            count--;
        }
        return sum;
    }
}