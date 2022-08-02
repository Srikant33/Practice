class Solution {
    public boolean checkPossibility(int[] nums) {
        boolean check = false; 
        for (int i=0; i<nums.length-1; i++){
            if (nums[i]> nums[i+1]){
                // System.out.println(nums[i] + " "+ prev);
                if (check){
                    return false; 
                }
                if (i==0 || nums[i-1] <=nums[i+1]){
                    nums[i]= nums[i+1];
                }
                else if (i>=nums.length-2 || nums[i] <=nums[i+2]){
                    nums[i+1]= nums[i];
                }
                else {
                    return false;
                }
                
                check = true;
            }
            
        }
        return true;
    }
}