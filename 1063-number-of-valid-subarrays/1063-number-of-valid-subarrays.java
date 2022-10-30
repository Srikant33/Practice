class Solution {
    public int validSubarrays(int[] nums) {
        Stack<Integer> st = new Stack<>();
        
        st.push(nums[0]);
        int res=1;
        for (int i=1; i<nums.length; i++){
            while (!st.isEmpty() && st.peek() > nums[i]){
                st.pop();
            }
            st.push(nums[i]);
            res+= st.size();
        }
        
        return res;
    }
}