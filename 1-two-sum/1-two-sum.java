class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len=nums.length;
        HashMap <Integer, Integer> map= new HashMap<Integer, Integer>();
        int[] a=new int[2] ; 
        for (int i=0;i<len;i++){
               if (map.containsKey(target-nums[i]))
                {   a[1]= i;
                    a[0]=map.get(target-nums[i]); 
                }        
                else 
                    map.put(nums[i],i);            
        }
        return a;
    }
}