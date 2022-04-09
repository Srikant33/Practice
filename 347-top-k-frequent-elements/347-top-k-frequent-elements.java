class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm= new HashMap<>();
        for (int num: nums){
            hm.put(num, hm.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> pq= new PriorityQueue((n1,n2)-> hm.get(n2)- hm.get(n1));
        for (int n: hm.keySet()){
            pq.add(n);
        }
        int arr[]= new int[k];
        for (int i=0;i<k; i++){
            arr[i]=pq.poll();
        }
        return arr;
    }
}