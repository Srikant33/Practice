class Solution {
    public int longestSubarray(int[] nums) {
        // vars 
        int max=0; 
        boolean deleted= false; 
        int start=0;

        // window
        for (int i=0; i<nums.length; i++){
            if (nums[i]==0){
                //if we have not deleted anything yet delete it
                if (!deleted){
                    deleted=!deleted;
                }
                //if we have mode the start of the window till after we have deleted previously
                else{
                    while (nums[start]!=0){
                        start++;
                    }
                    start++;
                }
            }

            max= Math.max(max, i-start+1);
        }

        return max-1;
    }
}