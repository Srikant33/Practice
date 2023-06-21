class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 2){
            return 0;
        }

        int min = prices[0];
        int max = prices[0];
        int res = 0; 

        for (int i=1; i< prices.length; i++){
            if (min > prices[i]){
                min = prices[i];
                max = prices[i];
            }
            if (max< prices[i]){
                max = prices[i];
                if (max-min > res){
                    res = max-min;
                }
            }
        }

        return res;

    }
}