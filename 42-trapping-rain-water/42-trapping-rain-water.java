class Solution {
    public int trap(int[] height) {
        int[] lm = new int[height.length];
        int[] rm = new int[height.length];
        int lmax=0 ;
        int rmax=0;
        
        for (int i=0; i<height.length; i++){
            if (height[i]>lmax){
                lmax = height[i];
            }
            lm[i]=lmax;
            
            
            int inv= height.length-1-i;
            if (height[inv]> rmax){
                rmax=height[inv];
            }
            rm[inv]=rmax;
        }
        
        int total=0;
        for (int i=0; i<height.length; i++){
            total+= Math.min(lm[i], rm[i])- height[i];
        }
        
        return total;
    }
}