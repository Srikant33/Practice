/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    
    
    int binarySearch(int l, int r)
    {
        if (r >= l) 
        {
            int mid = l + (r - l) / 2;
 
            if (isBadVersion(mid)==true && isBadVersion(mid-1)==false)
                return mid;
 
            if (isBadVersion(mid)==true)
                return binarySearch(l, mid - 1);
 
            return binarySearch(mid + 1, r);
        }
        return -1;
    }
     
    
    public int firstBadVersion(int n) {
        int a,b;
        int l=0;
        int r=n;
        //int m;
        // binarysearch(int l, int r);
        return binarySearch(l,r);
    }
}