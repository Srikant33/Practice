class Solution {
    public long minimumHealth(int[] damage, int armor) {
        
        long max =0, sum =0; 
        //traversre to find mnax 
        
        for (int i: damage){
            max= Math.max(i, max);
            sum+= i;
        }
        
        // System.out.println(sum);
        
        //find amt required 
        return sum +1 - ((max>armor)?armor : max); 
    }
}