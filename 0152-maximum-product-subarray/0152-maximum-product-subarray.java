class Solution {
    public int maxProduct(int[] nums) {

        if (nums.length==0){
            return 0;
        }
        int max=1, min=1, ret=nums[0];

        for (int num: nums){
            int first = max* num;
            int second = min*num;
            
            max= Math.max(first, Math.max(second, num));
            min = Math.min(first, Math.min(second, num));
            if (max>ret){
                ret=max;
            }
        }
        return ret;

    }

}