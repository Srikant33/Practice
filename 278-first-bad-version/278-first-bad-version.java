/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low=0, high=n, mid=0;
        
        while (low<=high){
            mid=low+(high-low)/2;
            if (isBadVersion(mid) && !isBadVersion(mid-1)){
                return mid;
            }
            else if (!isBadVersion(mid)){
                low=mid+1;
            }
           else if (isBadVersion(mid)){
                high=mid-1;
            }
        }
        return -1;
    }
}