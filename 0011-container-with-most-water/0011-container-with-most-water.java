class Solution {
    public int maxArea(int[] height) {
        int l=0, r=height.length-1, maxVol =0 ;
        int curVol;
        while (l<r){
            curVol = Math.min(height[l], height[r]) * (r-l);
            maxVol = Math.max(maxVol, curVol);
            // System.out.println(r-l-1);
            
            if (height[l]>=height[r]){ r--;} else {l++;}
        }
        return maxVol;
        
    }
}