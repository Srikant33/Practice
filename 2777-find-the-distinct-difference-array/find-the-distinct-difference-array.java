class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        //burute force approach 2 with O(N) with HashSet\

      
        int[] res = new int[nums.length];

        //loop through the list
        HashSet<Integer> pre = new HashSet<>();        
        HashSet<Integer> suf = new HashSet<>();

        //adding 2 arrays for storing pre and suff
        // int[] preArr = new int[nums.length];
        int[] sufArr = new int[nums.length];
        
        //LOOPING suff       
        for (int i=nums.length-1; i>=0; i--){
            sufArr[i]=suf.size();
            suf.add(nums[i]);
        }

        //looping pre 
        for (int i=0; i<nums.length; i++){
            pre.add(nums[i]);
            res[i]= pre.size()- sufArr[i];
        }
            
        //return res
        return res;
    }
}