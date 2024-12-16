import java.util.Collections;
import java.util.Arrays;
class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int[] sum = new int[nums.length];
        sum[0]= nums[0];
        for (int i=1; i< nums.length; i++){
            sum[i]= sum[i-1]+nums[i];
        } 
        int i=0;
        while (sum[i]<(double)sum[sum.length-1]/2){
            i++;
        }

        List<Integer> l = new ArrayList();

        for (int j=sum.length-1; j>=i; j--){
            l.add(nums[j]);
        }


        return l;
    }
}