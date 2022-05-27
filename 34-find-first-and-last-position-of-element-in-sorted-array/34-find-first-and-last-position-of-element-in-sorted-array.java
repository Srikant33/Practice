class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int low =0, high = nums.length-1, mid;
        int[] ret= new int[]{-1,-1};
        while (low<=high ){
            mid=low+(high-low)/2;
            if (nums[mid]==target && (mid==0 || nums[mid-1]!=target)){
                ret[0]=mid;
                 // System.out.println(" ");
                int low1 =mid, high1= nums.length-1, mid1 ;
                while (low1<=high1){
                    mid1=low1+(high1-low1)/2;
                    if (nums[mid1]==target && (mid1==nums.length-1 || nums[mid1+1]>target ) ){
                        ret[1]=mid1;
                        break;
                    }
                    else if (nums[mid1]==target){
                        low1=mid1+1;
                    }
                    else if (nums[mid1]>target){
                        high1=mid1-1;
                    }
                    // System.out.println(low1+" "+mid1+" "+high1);
                }
                break;
            }
            else if (nums[mid]<target){
                low=mid+1;
            }
            else 
                high=mid-1;
            // System.out.println(low+" "+mid+" "+high);
        }
        return ret;
    }
}