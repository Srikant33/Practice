class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a,b)->(a[1]-a[0])-(b[1]-b[0]));
        int count = costs.length/2;
        int sum =0;
        for (int i =0; i<costs.length; i++){
            if (count > 0){
                sum+=costs[i][1];
            }
            else{
                sum+=costs[i][0];
            }
            count--;
        }
        return sum;
    }
}