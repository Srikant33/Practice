class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        
        int i=0, count =0, sub =0;
        
        while (true){
            if (i == nums.length){
                break;
            }
            nums[i] -= sub;
            if (nums[i]==0){
                i++;
                continue;
            }
            sub += nums[i];
            i++;
            count++;
        }
        
        return count;
        
    }
}