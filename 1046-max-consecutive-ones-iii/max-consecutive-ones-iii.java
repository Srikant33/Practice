class Solution {
    public int longestOnes(int[] nums, int k) {
        //vars
        int start=0;
        int max=0;
        int flip=0; 

        //  window 
        for (int i=0; i<nums.length; i++){
            if (nums[i]==0) {
                flip++;
                // if we have made K flips else continue;
                if (flip > k ){
                    while (nums[start]!=0){
                        start++;
                    }
                    start++;
                    flip--;
                }
            }
            // System.out.println(i +" "+ start+ " "+ (i-start+1) );

            max= Math.max(max, i-start+1);
        }

        //return
        return max;
    }
}