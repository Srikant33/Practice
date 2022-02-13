class Solution {
    public int maxSubArray(int[] nums) {
        int max_so_far = nums[0];
        int current_sum = nums[0];
        for(int i = 1;i < nums.length;i++){
            current_sum = Math.max(current_sum + nums[i], nums[i]);
            // System.out.print (current_sum +" ");
            max_so_far = Math.max(current_sum, max_so_far);
        }
        return max_so_far;
    }
}