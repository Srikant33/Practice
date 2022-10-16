class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] fmap= new int[60];
        
        int pairs= 0;
        for (int i: time){
            int rtime=i%60;
            pairs += fmap[rtime>0 ?60-rtime:rtime];
            fmap[rtime]++;
        }
        
        return pairs;
    }
}