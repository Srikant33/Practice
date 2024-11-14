class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hs = new HashMap<>();

        for (int i=0;i< nums.length;i++){
            int temp=target-nums[i];
            if (hs.containsKey(temp)){
                return new int[]{hs.get(temp), i};
            }
            else{
                hs.put(nums[i],i);
            }
        }
        return null;
    }
}