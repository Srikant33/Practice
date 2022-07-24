class Solution {
    public int pivotIndex(int[] nums) {
        if (nums.length==1){
            return 0;
        }
        int f[] = new int[nums.length];
        int b[] = new int[nums.length];
        // int [] = new int[nums.length];
        f[0]= nums[0];
        b[nums.length-1] = nums[nums.length-1];
        for (int i=1;i<nums.length;i++){
            f[i] = f[i-1] + nums[i];
            b[nums.length -1 -i] = b[nums.length -i] +nums[nums.length -i -1];
            
        }
         if (b[1] == 0){
            return 0;
        }
        for (int i=1;i<nums.length;i++){
            if (i<nums.length-1 && f[i-1] == b[i+1]){
                return i;
            }
            // System.out.println(i+" " +f[i] + " "+ b[i]);
        }
        if (f[nums.length-2] == 0){
            return nums.length-1;
        }
        return -1;
        
    }
}