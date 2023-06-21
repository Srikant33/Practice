class Solution {
    
    public int removeElement(int[] nums, int val) {
        if (nums.length==0){
            return 0;
        }
        int j=nums.length-1;
        while (j>=0 && nums[j]==val){
            j--;
        }

        for (int i=0; i<nums.length && i<j; i++){
            if (nums[i]==val){
                nums[i] = nums[j];
                nums[j] = val;
            }
            while (nums[j]==val){
                j--;
            }
        }

        return j+1;
    }
}