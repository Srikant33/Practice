class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l=-1;
        int ret=0, prod=1;
        for (int i=0; i<nums.length; i++){
            prod*=nums[i];
            while (prod>=k & l<i){
                l++;
                prod/=nums[l];
            }
            // System.out.println(l+" "+i + " "+prod);
            ret+=i-l;
        }
        return ret;
    }
}