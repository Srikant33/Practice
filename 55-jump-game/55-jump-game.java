class Solution {
    public boolean canJump(int[] nums) {
        int max= nums[0];
        if (max >= nums.length-1){
                return true;
        }
        for (int i=1 ;i<=max; i++){
            max=Math.max(max, nums[i] + i);
            if (max >= nums.length-1){
                return true;
            }
        }
       
        return false;
    }
}