class Solution {
    public int maxOperations(int[] nums, int k) {
        // sort the array 
        Arrays.sort(nums);

        // use 2 pointer for finding pairs
        int front=0, back=nums.length-1; 
        int res = 0;

        // every pair you find move both the pointer 
        while (front < back ){
            if (nums[front]+ nums[back] == k){
                res++;
                front++;
                back--;
            }
        
        // if it is more ... reduce the back
            else if (nums[front]+ nums[back] > k){
                back--;
            } 
        // if it is less ... increase the front 
            else {
                front++;
            }
        }

        return res;

    }
}