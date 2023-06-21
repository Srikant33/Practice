class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max =-1 , oc =-1;

        for (int i=0; i<nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
            if (hm.get(nums[i])>oc){
                max=nums[i];
                oc=hm.get(nums[i]);
            }
        }

        return max;
    }
}