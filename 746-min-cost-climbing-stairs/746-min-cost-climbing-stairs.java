class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int one = 0;
        int two = 0;
        
        for (int i=0; i<cost.length; i++){
            int temp = two;
            two = Math.min(one, two)+cost[i];
            one = temp;
        }
        
        return Math.min(one, two);
    }
}