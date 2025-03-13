class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        //burute force approach with HashSet\

      
        int[] res = new int[nums.length];

        //loop through the list
        for (int i=0;i < nums.length; i++){
            HashSet<Integer> pre = new HashSet<>();        
            HashSet<Integer> suf = new HashSet<>();
            //looping pre 
            for (int j=0; j<=i; j++){
                pre.add(nums[j]);
            }
            //looping post
            for (int j=i+1; j<nums.length; j++){
                suf.add(nums[j]);
            }
            res[i]= pre.size()- suf.size();
        }
        
        //return res
        return res;
    }
}