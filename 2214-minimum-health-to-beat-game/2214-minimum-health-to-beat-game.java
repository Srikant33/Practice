class Solution {
    public long minimumHealth(int[] damage, int armor) {
        
        long max =0, sum =0; 
        
        for (int i: damage){
            max= Math.max(i, max);
            sum+= i;
        }
        return sum +1 - ((max>armor)?armor : max); 
    }
}