class Solution {
    public int findPeakElement(int[] nums) {
        // find peak by binary search 
        int min = 0;
        int max= nums.length-1;

        while (min<=max){
            int mid = min + (max-min)/2;
            // ans 
            if ((mid ==0 ||nums[mid-1]< nums[mid]) && (mid== nums.length-1 || nums[mid]>nums[mid+1])){
                return mid;
            }
            // if 2 consicutive are large  ... look before 
            else if (mid== nums.length-1 || nums[mid]<nums[mid+1]){
                min= mid+1;
            }
             // if 2 consecutives are small .... look after 
            else if (mid ==0 || nums[mid]<nums[mid-1]){
                max= mid-1;
            }
        }

        //return case if none found
        return -1;
        
       
    }
}