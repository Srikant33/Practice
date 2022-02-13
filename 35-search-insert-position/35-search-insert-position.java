class Solution {
    public int bs(int[] nums, int l, int r, int target)
    {   int m=0;
         if (target < nums[l])
             return 0;
         while (l<=r)
         {   //return 11;
             
             m=l+(r-l)/2;
             System.out.println(nums [m]+" "+m+" "+l+" "+r);
             if (nums [m]==target)
             {  return m;
             }
             else if (nums [m]>target && nums[m-1]<target)
             {  return m;
             }
             else if (nums [m]>target)
             {  r=m-1;
             }
             else if (nums [m]<target)
             {    l=m+1;
             }
         }
         return m+1;
    }
    public int searchInsert(int[] nums, int target) {
        int l=0,r=0;
        r=nums.length-1;
        return bs(nums, l , r, target);
    }
}