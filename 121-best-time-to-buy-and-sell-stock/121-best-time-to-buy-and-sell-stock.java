class Solution {
    public int maxProfit(int[] prices) {
        int buy=10000,sell=0,val=0, max=0;
        for (int i=0;i<prices.length;i++){
            if (buy>prices[i]){
                buy=prices[i];
                sell=prices[i];
            }
            if (sell < prices[i])
            {   
                // System.out.println(buy+""+sell);
                sell=prices[i];
                val=sell-buy;
                if (max<val){
                    max=val;
                }
            }
        }
        //System.out.println(buy+""+sell);
        return max;
    }
}