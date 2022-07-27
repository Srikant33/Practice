class Solution {
    public int findMin(int[] nums) {
        int l=0, r= nums.length-1 , m=0;
        
        while (l<=r){
            m= l + (r-l)/2;
            System.out.println(nums[m]+" "+ nums[r]);
            if ((m>0 && nums[m] < nums[m-1]) || (m==0 && nums[m] <= nums[r])){
                return nums[m];
            }
            else if (nums[m] >= nums[l]){
                if (nums[l]> nums[r]){
                    l=m+1;
                }
                else {
                    r=m-1;
                }
            }
            else{
                if (nums[l] >nums[r]){
                    r=m-1;
                }
                else {
                    l = m+1;
                }
            }
            
        }
        
        return -1;
    }
}