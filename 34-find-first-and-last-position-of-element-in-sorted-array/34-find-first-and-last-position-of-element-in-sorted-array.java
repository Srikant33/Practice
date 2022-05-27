class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0, high= nums.length-1, mid;
        int[] ret= new int[]{-1,-1};
        // if (high==0){
        //     return ret;
        // }
        // System.out.println(low+""+high);
        while (low<=high){
            mid= low+(high-low)/2;
            // System.out.println(nums[mid]);
            if (nums[mid]==target && (mid==0 || nums[mid-1]!=target) ){
                // System.out.println("aa");
                ret[0]=mid;
                int l=mid, h=nums.length-1, m;
                while (l<=h){
                    m= l+(h-l)/2;
                    if (nums[m]==target && ( m==nums.length-1 || nums[m+1]!=target)){
                        ret[1]=m;
                    }
                    if (target<nums[m]){
                        h= m-1;
                    }
                    else{
                        l=m+1;
                    }
                }
                break;
            }
            else if (target>nums[mid]){
                low= mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ret;
    }
}