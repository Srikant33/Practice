class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<List<Integer>> pq = new PriorityQueue<>((a,b)-> (a.get(0)+a.get(1)) - (b.get(0)+b.get(1)));
        int a, b;
        for (int i=0; i< nums1.length && i <k ; i++){
                pq.add(new LinkedList<Integer>(Arrays.asList(nums1[i],nums2[0], 0)));
        }

        List<List<Integer>> l= new LinkedList<>();

        while (!pq.isEmpty() && k>0){
            // System.out.println(pq);
            List<Integer> temp = pq.poll();
            l.add(new LinkedList<Integer>(Arrays.asList(temp.get(0), temp.get(1))));
            if (temp.get(2)+1 < nums2.length)
                pq.add(new LinkedList<Integer>(Arrays.asList(temp.get(0), nums2[temp.get(2)+1], temp.get(2)+1)));
            k--;
        }

        return l;
    }
}