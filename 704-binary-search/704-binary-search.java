class Solution {
    public int binarySearch (int[] nums, int l, int r, int target)
    {   int m;
        if (r>=l)
        {   m=l+(r-1)/2;
            if (nums[m]==target)
            {   return m;
            }
            else if (nums[m]>target)
            {   return binarySearch(nums, l, m-1, target);
            }
            return binarySearch(nums, m+1, r, target);
        }
        return -1;
    }
    
    int binarySearch2(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
 
            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;
 
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
 
            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }
 
        // We reach here when element is not present
        // in array
        return -1;
    }
    
    
    int binarySearch3(int array[], int low, int high, int x) {

    // Repeat until the pointers low and high meet each other
    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (array[mid] == x)
        return mid;

      if (array[mid] < x)
        low = mid + 1;

      else
        high = mid - 1;
    }

    return -1;
  }
    
    public int binarySearch4 (int[] nums,int l,int r,int target)
    {
        while (l<=r)
        {
            int m =l+(r-l)/2;
            if (nums[m]==target)
            {   return m;
            }
            else if (nums[m]<target)
                l=m+1;
            else 
                r=m-1;
        }
        return -1;
    }
    
    public int search(int[] nums, int target) {
        int r=nums.length;
        int l=0;
        return binarySearch4(nums, l, r-1, target);
    }
}