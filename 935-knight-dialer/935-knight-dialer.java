class Solution {
    HashMap<Integer, List<Integer>> hm= new HashMap<>();
    HashMap<Pair<Integer, Integer>, Long> dp= new HashMap<>();
    
    public long helper (int n, int prev){
        if (n==1){
            return 1;
        }
        if (dp.containsKey(new Pair<>(n, prev))){
            return dp.get(new Pair<>(n, prev));
        }
        long sum=0;
        List<Integer> l = hm.get(prev);
        for (int i: l){
            sum= (sum + helper(n-1, i))%1000000007;
        }
        dp.put(new Pair<>(n, prev), sum);
        // System.out.println(sum);
        return sum;
    }
    
    public int knightDialer(int n) {
        hm.put(1, new ArrayList<Integer>(Arrays.asList(6,8)));
        hm.put(2, new ArrayList<Integer>(Arrays.asList(7,9)));
        hm.put(3, new ArrayList<Integer>(Arrays.asList(4,8)));
        hm.put(4, new ArrayList<Integer>(Arrays.asList(3,9,0)));
        hm.put(5, new ArrayList<Integer>(Arrays.asList()));
        hm.put(6, new ArrayList<Integer>(Arrays.asList(1,7,0)));
        hm.put(7, new ArrayList<Integer>(Arrays.asList(2,6)));
        hm.put(8, new ArrayList<Integer>(Arrays.asList(1,3)));
        hm.put(9, new ArrayList<Integer>(Arrays.asList(4,2)));
        hm.put(0, new ArrayList<Integer>(Arrays.asList(4,6)));

        long total=0;
        for (int i=0; i<10; i++){
            total = (total + helper(n, i))%1000000007;
            // System.out.println(total);
            // total = (long)(total%(Math.pow(10,9)+7));
        }
        
        return (int)total;
        
        
    }
}