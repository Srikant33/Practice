class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int[] sums= new int[nums.length+1];
        sums[0]=0;
        for (int i=1; i<= nums.length; i++){
                
                sums[i]=sums[i-1]+nums[i-1];
                if (i>1 && sums[i]==sums[i-2]) {
                    return true;
                }
        }

        for (int i=2; i<sums.length; i++){
            if (sums[i]< k){
                continue;
            }
            for (int j=0; j<=i-2; j++){
                System.out.println(sums[i]-sums[j]);
                if (sums[i]-sums[j]!=0 && sums[i]-sums[j]<k ){
                    break;
                }
                else if ((sums[i]-sums[j])%k ==0){
                    return true;
                }
            }   
        }
        return false;
    }
}