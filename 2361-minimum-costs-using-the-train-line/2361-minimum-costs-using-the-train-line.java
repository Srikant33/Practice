class Solution {
    public long[] minimumCosts(int[] regular, int[] express, int expressCost) {
        long[] dp = new long[express.length];
        
        long[] rdp =new long[express.length];
        long[] edp =new long[express.length];
        
        boolean exp= false;
        rdp[0] = regular[0];
        edp[0] = express[0]+expressCost;
        if (rdp[0]> edp[0]+expressCost){
            exp=!exp;
        }
        dp[0] = Math.min(rdp[0], edp[0]);
        
        for (int i=1; i<express.length; i++){
            rdp[i]= Math.min(regular[i]+rdp[i-1], regular[i]+edp[i-1]);
            edp[i]= Math.min(express[i]+expressCost+rdp[i-1], express[i]+edp[i-1]);
            
            dp[i]= Math.min(rdp[i], edp[i]);
        }
        
        return dp;
    }
}