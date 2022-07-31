class Solution {
    public int reverse(int x) {
        boolean neg = false ;
        if (x<0){
            neg = true; 
        }
        x=Math.abs(x);
        int ret=0;
        while (x>0){
            if (ret > (Integer.MAX_VALUE - x%10 )/10){
                // System.out.println(ret + " "+ x);
                return 0;
            }
            ret =ret *10 + x%10;
            x=x/10;
        }
        return ret * ((neg)?-1:1);
    }
}