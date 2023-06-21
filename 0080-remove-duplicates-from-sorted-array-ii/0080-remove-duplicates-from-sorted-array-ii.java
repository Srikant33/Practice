class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length<3){
            return nums.length;
        }
        int curr = nums[0];
        int count = 1;
        int prev = 0;

        for (int i=1;i<nums.length; i++){
            if (nums[i]==curr){
                if (count == 1){
                    nums[++prev]=nums[i];
                    count++;
                }
                else{
                    continue;
                }
            }
            else {
                nums[++prev] = nums[i];
                count =1; 
                curr= nums[i];
            }
        }

        return prev+1;
    }
}