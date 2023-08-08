class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer, List<List<Integer>>> hm = new HashMap<>();
        int least = Integer.MAX_VALUE;

        for (int i=1; i<arr.length; i++){
            int diff = arr[i]-arr[i-1];

            if (diff <least){
                least = diff;
            }

            List<List<Integer>> ll = hm.getOrDefault(diff, new LinkedList<>());
            List<Integer> l = new LinkedList<>(Arrays.asList(arr[i-1],arr[i]));
            ll.add(l);
            hm.put(diff, ll);
        }

        return hm.get(least);
    }
}