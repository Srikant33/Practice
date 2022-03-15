class Solution {
    public int deleteAndEarn(int[] nums) {
        Arrays.sort(nums);
        int one=0, two=0, temp=0;
        
        HashMap<Integer, Integer> hm= new HashMap<>();
        for (int i=0 ;i <nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+nums[i]);
        }
        System.out.println(hm);
        for (int i=0;i <=nums[nums.length-1]; i++){
            temp=two;
            two=Math.max(one+hm.getOrDefault(i, 0), two);
            one=temp;
            System.out.println(i+" "+one+" "+two);
        }
        
        return Math.max(one, two);
        
    }
}