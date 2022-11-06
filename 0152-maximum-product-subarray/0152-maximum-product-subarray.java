class Solution {
    public int maxProduct(int[] nums) {

        if (nums.length==0){
            return 0;
        }
        int max=1, min=1, ret=nums[0];

        for (int num: nums){
            int first = max* num;
            int second = min*num;
            
            max= Collections.max(Arrays.asList(first, second, num));
            min = Collections.min(Arrays.asList(first, second, num));
            if (max>ret){
                ret=max;
            }
        }
        return ret;

    }

}