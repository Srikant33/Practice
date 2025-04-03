class Solution {
    public int[] productExceptSelf(int[] nums) {
        // make prefix product array 
        //amke suffix array 
        //multiply both sides for answers 

        // making arrays 
        int[] pre = new int[nums.length];
        int[] suf = new int[nums.length];
        int[] ans = new int[nums.length];

        // inital 
        pre[0]=nums[0];
        suf[nums.length-1]=nums[nums.length-1];
        // populating pre and suf 
        for (int i=1, j=nums.length-2; i<nums.length ;i++, j--){
            // pre 
            pre[i]= nums[i]* pre[i-1];
            suf[j]= nums[j]* suf[j+1];
        }

        // popuating ans
        for (int i=0; i<nums.length; i++){
            if (i == 0 && nums.length>1){
                ans[i]=suf[i+1];
            }
            else if (i == nums.length-1 && nums.length>1){
                ans[i]=pre[i-1];
            }
            else{
                ans[i]=pre[i-1]*suf[i+1];
            }
        }

        //return asnwer
        return ans;
    }
}