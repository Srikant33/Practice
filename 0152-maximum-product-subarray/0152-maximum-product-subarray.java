class Solution {
    public int maxProduct(int[] nums) {

        if (nums.length==0){
            return 0;
        }
        int max=1, min=1, ret=nums[0];

        for (int num: nums){
            if (num==0){
                max=1;
                min=1;
                // ret=Math.max(ret,0);
                // continue;
            }
            int first = max* num;
            int second = min*num;
            
            max= Collections.max(Arrays.asList(first, second, num));
            min = Collections.min(Arrays.asList(first, second, num));
            ret= Math.max(ret, max);


        }
        return ret;

    }

}