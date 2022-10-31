class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int max=0; 
        
        for (int i=0; i<satisfaction.length; i++){
            int total=0, count=1;
            for (int j=i; j<satisfaction.length; j++){
                total += satisfaction[j]*count;
                count++;
            }
            max= Math.max(max, total);
        }
        
        return max;
    }
}