class Solution {
    public int countBinarySubstrings(String s) {
        int prev=0, cur=1, count=0;
        for (int i=1; i<s.length(); i++){
            // System.out.print(s.charAt(i)+ " ");
            if (s.charAt(i)!=s.charAt(i-1)){
                count= count+ Math.min(prev, cur);
                // System.out.println(" checking "+cur + " "+ prev);
                prev=cur;
                cur=1;
            }
            else{
                cur++;
            }
        }
        return count+ Math.min(prev, cur);
    }
}