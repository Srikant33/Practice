class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ret= new int[nums.length];
        int pf=0 , pb=nums.length-1;
        for (int i=0;i<nums.length; i++){
            if (nums[i]%2==0){
                ret[pf]=nums[i];
                pf++;
            }
            else {
                ret[pb]=nums[i];
                pb--;
            }
        }
        return ret;
    }
}