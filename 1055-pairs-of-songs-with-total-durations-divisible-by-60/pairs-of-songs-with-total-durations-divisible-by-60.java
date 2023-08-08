class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count =0;
        for (int i: time){
            i=i%60;
            count += hm.getOrDefault((60-i)%60, 0);
            hm.put(i, hm.getOrDefault(i,0)+1);
        }
        
        
        return count;
    }
}