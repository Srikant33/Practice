class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length ;
        if (k ==0){
            return ;
        }
        if (nums.length ==1){
            return ;
        }
        nums = reverse (nums, 0, nums.length-1);
        nums = reverse (nums, 0, k-1);
        nums = reverse (nums, k, nums.length-1);
    }
    
    public int[] reverse(int[] nums, int start, int end){
        for (int i = 0; i<=(end-start)/2; i++){
            int temp = nums[start + i];
            nums[start + i] = nums[end - i];
            nums[end -i ]= temp;
        }
        return nums;
    }
}