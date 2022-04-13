class Solution {
    public int mySqrt(int x) {
        double mid=0,low=0, high =x;
        double sq, sq2;
        while (low<=high){
            mid= Math.floor(low+(high-low)/2);
            sq = mid*mid;
            sq2 = (mid+1)*(mid+1);
            
            // System.out.print(mid+ " ");
            if (sq<=x && sq2>x && (int)(sq2)!=x){
                return (int)(mid);
            }
            else if (sq>x){
                high=mid-1;
            }
            else if (sq<=x){
                low=mid+1;
            }
        }
        return (int)(mid);
    }
}