class Solution {
    public void moveZeroes(int[] nums) {
        // 2 pointer approach
        int zero =0;
        int non=0;

        //iterating 
        while (zero < nums.length){
            //find first 0
            if (nums[zero]==0){
                non= zero;
                //firnd first non 0 
                while (nums[non]==0){
                    non++;
                    // break if we reached end 
                    if (non == nums.length){
                        return;
                    }
                }
                //swap

                // System.out.println(zero+""+non);
                nums[zero]= nums[non];
                nums[non]=0;
            }
            else{
                //find next zero
                zero++;
            }
        }

    }
}