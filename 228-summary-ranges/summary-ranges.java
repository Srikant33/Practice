class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> l = new LinkedList<>();
        if (nums.length==0){
            return l;
        }
        int start=nums[0], prev=nums[0];
        for (int i=1;i<nums.length; i++){
            if (nums[i] == prev+1){
                prev = nums[i];
            }
            else {
                StringBuilder sb = new StringBuilder();

                sb.append(String.valueOf(start));
                if (prev != start){
                    sb.append("->");
                    sb.append(String.valueOf(prev));
                }

                l.add(sb.toString());

                start = nums[i];
                prev = nums[i];
            }
        }

                StringBuilder sb = new StringBuilder();

                sb.append(String.valueOf(start));
                if (prev != start){
                    sb.append("->");
                    sb.append(String.valueOf(prev));
                }

                l.add(sb.toString());
                
        return l;
    }
}