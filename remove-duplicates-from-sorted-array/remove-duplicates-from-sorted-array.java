class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <2){
            return nums.length ;
        }

        int curr= nums[0], pos = 0;
        for (int i=1; i<nums.length ;i++){
            if (nums[i]==curr){
                continue;
            }
            else{
                nums[++pos]= nums[i];
                curr= nums[i];
            }
        }

        return pos+1;
    }
}