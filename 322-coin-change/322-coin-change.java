class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] amt= new int[amount+1];
        amt[0]=0;
        for (int i=1;i<=amount;i++){
            amt[i]=amount+1;
            for (int c : coins){
                if (i-c>=0){
                    amt[i]=Math.min(amt[i], amt[i-c]+1);    
                }
                // System.out.print(amt[i]);

            }
            // System.out.println(amt[i]);
        }
        
        if (amt[amount]==amount+1) return -1;
        return amt[amount];
    }
}