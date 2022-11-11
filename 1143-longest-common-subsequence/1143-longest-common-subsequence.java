class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int[][] dp = new int[text2.length()+1][text1.length()+1];
        // int[] temp =;
        // Arrays.fill(new int[text1.length()+1], 0);
        // Arrays.fill(dp, 0);
        
        //  for (int i=0; i<text2.length()+1;i++){
        //     for (int j=0; j<text1.length()+1;j++){
        //         System.out.print(dp[i][j]+" ");
        //     }    
        //      System.out.println(" ");
        // }
        
        for (int i=text2.length()-1; i>=0 ;i--){
            for (int j=text1.length()-1; j>=0 ;j--){
                if (text2.charAt(i)== text1.charAt(j)){
                    dp[i][j]= dp[i+1][j+1]+1;
                } 
                else {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
                }
            }    
        }
        
//         for (int i=0; i<text2.length()+1;i++){
//             for (int j=0; j<text1.length()+1;j++){
//                 System.out.print(dp[i][j]+" ");
//             }    
//              System.out.println(" ");
//         }
        
        return dp[0][0];
    }
}