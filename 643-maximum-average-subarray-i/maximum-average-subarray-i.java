class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // declair var
        double ave;
        double sum=0;
        double res;
        //get the first windwo
        for (int i=0; i<k; i++){
            sum+=nums[i];    
            // System.out.println(sum);
        }

        //get first average 
        ave=sum/k;
        res=ave;

        // LOOP THROUGH THE ARRY sliding window
        for (int i=k; i<nums.length;i++){
            // System.out.println(res);
            ave=((ave*k)-nums[i-k]+nums[i])/k;
            res= Math.max(res, ave);
        }

        //return res
        return res;
    }
}