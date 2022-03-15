class Solution {
    
    public int houseRobber(int[] nums, int start, int end){
        int[] sum=new int[end-start+1];
        // System.out.println(end-start);
        if (end-start ==0){
            return 0;
        }
        else if (end-start==2){
            return Math.max(nums[start],nums[start+1]);
        }
        else if (end-start ==1){
            return nums[start];
        }
        
        
        else{
            sum[0]= nums[start];
            sum[1]= Math.max(nums[start],nums[start+1]);
            sum[2]= sum[0]+nums[start+2];
            
            
            System.out.println(nums[0]+" "+sum[0]);
            System.out.println(nums[1]+" "+sum[1]);
            System.out.println(nums[2]+" "+sum[2]);
            System.out.println(end);
            for (int i=3;i<end-start; i++){
                sum[i]=Math.max(nums[start+i]+sum[i-2], sum[i-1]);    
                System.out.println(nums[start+i]+" "+sum[i]);
            }
        }
        System.out.println(" ");
        return Math.max( sum [end-1],sum[end-2]);
    }
    
    public int rob(int[] nums) {
        if (nums.length==1){
            return nums[0];
        }
        return Math.max(houseRobber(nums,0, nums.length-1), houseRobber(nums, 1, nums.length));    
    }
}