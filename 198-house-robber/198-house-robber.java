class Solution {
    public int rob(int[] nums) {
        int[] amt= new int[nums.length];
        amt[0]=nums[0];
         if (nums.length==1){
            return amt[nums.length-1];
        }
        
        amt[1]=nums[1];
        if (nums.length==2){
            return Math.max(amt[nums.length-1],amt[nums.length-2]);
        }
        
        amt[2]=nums[2] + nums[0];
        if (nums.length==3){
            return Math.max(amt[nums.length-1],amt[nums.length-2]);
        }
        
        for (int i=3;i<nums.length; i++){
            amt[i] = Math.max(amt[i-3], amt[i-2])+nums[i];
        }
        // for (int i=0;i<nums.length; i++){
        //     System.out.println(amt[i]);
        // }
        return Math.max(amt[nums.length-1],amt[nums.length-2]);
    }
}