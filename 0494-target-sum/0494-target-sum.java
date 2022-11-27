class Solution {
    int count;
    
    public void helper (int[] nums, int target, int cur, int sum){
        if (cur == nums.length ){
            if ( sum ==target){
                count++;
            }
            return;
        }
        helper(nums, target, cur+1, sum+ nums[cur]);
        helper(nums, target, cur+1, sum- nums[cur]);
        return;
    }
    
    public int findTargetSumWays(int[] nums, int target) {
        helper(nums, target, 0, 0);
        return count;    
    }
}