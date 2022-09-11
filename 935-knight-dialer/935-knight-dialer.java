class Solution {
    public int knightDialer(int n) {
        long[] dp = new long[10];
        long[] temp = new long[10];
        Arrays.fill(dp,1);
        for (int i =0 ;i<n; i++){
            temp[1] = dp[8]+dp[6] ;
            temp[2] = dp[7]+dp[9] ;
            temp[3] = dp[4]+dp[8] ;
            temp[4] = dp[3]+dp[9]+dp[0] ;
            temp[5] = 0 ;
            temp[6] = dp[1]+dp[7]+dp[0] ;
            temp[7] = dp[2]+dp[6] ;
            temp[8] = dp[1]+dp[3] ;
            temp[9] = dp[2]+dp[4] ;
            temp[0] = dp[4]+dp[6] ;
            
            for (int j=0; j<10; j++) temp[j] = temp[j]% 1000000007;
            long[] arr = dp;
            dp =temp; 
            temp = arr;
        }
        
        long res =0;
        for (int i=0 ;i<10; i++) res = (res + temp[i])%1000000007;
        
        return (int)res;
    }
}