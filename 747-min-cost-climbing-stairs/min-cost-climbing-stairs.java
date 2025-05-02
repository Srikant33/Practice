class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // dp to store min value 
        int dp[] = new int[cost.length];

        //initlaization 
        dp[0]= cost[0];
        dp[1]= cost[1];

        // looping through the cost 
        // populating my minimum cost 
        for (int i=2; i<cost.length;i++){
            dp[i]=cost[i]+(Math.min(dp[i-1], dp[i-2]));
        }

        //Return the last or 2nf last step
        return Math.min(dp[dp.length-1], dp[dp.length-2]);

    }
}