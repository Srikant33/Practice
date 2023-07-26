class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i=0;i< nums.length; i++){
            if (hm.containsKey(nums[i]) && (i-hm.get(nums[i])) <=k){
                // System.out.println(nums[i]+" "+i);
                return true;
            }
            hm.put(nums[i], i);
        }

        return false;
    }
}