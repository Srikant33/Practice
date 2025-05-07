class Solution {
    public int rob(int[] nums) {
        // dp problem 
        // skipping 1 house is essentail 
        // skipping more than 2 is illogical as we can use 2 jumps inmstead 
        
        // less houses 
        if (nums.length == 1){
            return nums[0];
        }

        //dp initalization 
        int dp[]= new int[nums.length];

        // initial values 
        dp[0]= nums[0];
        dp[1]= nums[1];

        // polulation
        for (int i=2; i< nums.length; i++){
            dp[i]= nums[i]+ Math.max(dp[i-2], i>2?dp[i-3]:0);
        }

        // return the max between last 2 values;
        return Math.max(dp[nums.length-1], dp[nums.length-2]);

    }
}