class Solution {
    public int maxProfit(int[] prices) {
        int prev = prices[0], sum =0;
        for (int i : prices){
            if (prev<i){
                sum+= i-prev;
            }
            prev = i;
        }

        return sum;
    }
}