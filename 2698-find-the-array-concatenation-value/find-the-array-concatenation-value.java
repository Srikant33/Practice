class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long sum=0;
        for (int i=0; i<nums.length/2; i++){
            StringBuilder sb = new StringBuilder();
            sb.append(nums[i]);
            sb.append(nums[nums.length-1-i]);
            sum+=Long.parseLong(sb.toString());
        }

        if (nums.length%2==1){
            sum+=nums[nums.length/2];
        }

        return sum;
    }
}