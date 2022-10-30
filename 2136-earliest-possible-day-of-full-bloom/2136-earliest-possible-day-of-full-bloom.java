class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int pTime =0, max =0;
        List<Pair<Integer, Integer>> pairs= new LinkedList<>();
        for (int i=0; i<plantTime.length; i++){
            pairs.add(new Pair<>(plantTime[i], growTime[i]));
        }        
        
        Collections.sort(pairs, (a,b)-> b.getValue()-a.getValue());
        
        for (Pair<Integer, Integer> p: pairs){
            max = Math.max(max, pTime+p.getKey()+ p.getValue());
            pTime += p.getKey();
        }        
        
        
        return max;
    }
}