class Solution {
    public boolean helper (int[] piles, int n, int h){
        int total=0;

        // divide every elemt and add it up
        for (int pile: piles ){
            total += Math.ceil((double)pile/(double)n);
        }
        //return if possible within time
        System.out.println(n+ " "+total);
        return h>= total;

    }
    public int minEatingSpeed(int[] piles, int h) {
        // binary searach through possible solutions and find the most efficient one 
        Arrays.sort(piles);
        int min = 1 ;
        int max = piles[piles.length-1];
        int res = max; 

        // binary 
        // new binar ysearch technique 
        // to find lowest value larger than something 
        // min < max and onlu increase min -> mid +1 
        // max = mid ...and return min 
        while (min < max){
            int mid = min + (max-min)/2;
            //if it wont fit ... reduce min to mid +1 
            if (!helper(piles, mid, h)){
                min = mid + 1;
            }
            //if it fits make max mid
            else {
                max = mid;
            }
        }

        return min;
    }
}