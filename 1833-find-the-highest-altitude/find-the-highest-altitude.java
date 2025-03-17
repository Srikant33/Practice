class Solution {
    public int largestAltitude(int[] gain) {
        // int [] to store prefix sum 
        int[] pre= new int[gain.length+1];
        int max=0;

        //initializing
        pre[0]=0;

        //loopinmg through the array 
        for (int i=0; i<gain.length; i++){
            pre[i+1]=pre[i]+gain[i]; 
            max=Math.max(max, pre[i+1]);
        }

        //returning
        return max;
    }   
}