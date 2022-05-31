class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] arr= new int[temperatures.length];
        
        Stack<Integer> st= new Stack<>();
        st.push(0);
        for (int i=1 ; i<temperatures.length; i++){
            int count=0;
            if (temperatures[i]>temperatures[st.peek()]){
                while (!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                    count++;
                    arr[st.peek()]=i-st.pop();
                }
            }

            st.push(i);
        }
        
        return arr;
    }
}