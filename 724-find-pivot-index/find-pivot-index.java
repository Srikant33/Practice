class Solution {
    public int pivotIndex(int[] nums) {
        // making prefix and postfic arrays 

        //declaiueing arrays 
        int[] pre = new int[nums.length+2];
        int[] pos = new int[nums.length+2];

        //initializiation
        pre[0]=0;
        pos[0]=0;
        pre[nums.length+1]=0;
        pos[nums.length+1]=0;
        
        //sum array 

        for (int i=nums.length-1, j=0; i>=0; i--, j++){
            pos[i+1]= nums[i]+pos[i+2];
            pre[j+1]= nums[j]+pre[j];
        }

        //finding leftmost point
        for(int i=1; i<pre.length-1; i++){
            if (pre[i]==pos[i]){
                //returning result
                return i-1;
            }
        }

        //returning if not found 
        return -1;
    }
}