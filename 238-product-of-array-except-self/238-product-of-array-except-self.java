class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res=new int[nums.length];
        int pre=1, post=1;
        for (int i=0; i<nums.length;i++){
            if (i==0){
                res[i]=1;
            }
            else {
                pre= nums[i-1]*pre;
                res[i]=pre;
            }
        }
        for (int i=nums.length-1;i>=0;i--){
            if (i==nums.length-1){
                res[i]=res[i]*1;
            }
            else {
                post=post * nums[i+1];
                res[i]=res[i]*post;
                
            }
        }
        return res;
    }
}