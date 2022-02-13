class Solution {
    public boolean containsDuplicate(int[] nums) {
        //Arrays.sort(nums);
        //HashMap <Integer,Integer > hm = new HashMap <Integer,Integer > (); 
        Set <Integer> hm= new HashSet <Integer>();
        for (int i=0;i<nums.length;i++){
            
            if (hm.contains(nums[i]))
                return true;
            else
                hm.add(nums[i]);
        }    
        return false;
    }
}