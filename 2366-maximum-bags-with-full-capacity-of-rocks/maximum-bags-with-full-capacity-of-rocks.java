class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n= rocks.length;
        int rem[]= new int[n];

        // remining size 
        for (int i=0; i<n; i++){
            rem[i]=capacity[i]-rocks[i];
        }

        Arrays.sort(rem);

        int result=0;
        int i=0;
        while (additionalRocks>0){
            while(rem[i]==0 && i<n){
                i++;
                result++;
            }
            if (rem[i]<=additionalRocks){
                additionalRocks-=rem[i];
                result++;
                i++;
            }
            else {
                break;
            }
            if (i==n){
                break;
            }
        }

        return result;
    }
}