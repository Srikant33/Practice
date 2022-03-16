class Solution {
    public boolean canJump(int[] nums) {
        int[] upto =new int [nums.length];
        upto[0]=nums[0];
        int max= nums[0];
        if (max >= nums.length-1){
                return true;
        }
        for (int i=1 ;i<=max; i++){
            upto[i]= nums[i] + i;
            max=Math.max(max, upto[i]);
            if (max >= nums.length-1){
                return true;
            }
        }
       
        return false;
    }
}