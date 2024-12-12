class Solution {
    public int maxProduct(int[] nums) {
        int highest=Integer.MIN_VALUE, highest2=Integer.MIN_VALUE;

        for (int i=0;i<nums.length;i++){
            // if (lowest2>nums[i]){
            //     if (lowest>nums[i]){
            //         lowest2=lowest;
            //         lowest=nums[i];
            //     }
            //     else{
            //         lowest2=nums[i];
            //     }
            // }
            
            if (highest2<nums[i]){
                if (highest<nums[i]){
                    highest2=highest;
                    highest=nums[i];
                }
                else{
                    highest2=nums[i];
                }
            }
        }
        // System.out.println(lowest+" "+ lowest2+" "+ highest+" "+ highest2);
        return (highest-1)*(highest2-1);
    }
}