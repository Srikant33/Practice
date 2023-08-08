class Solution {
    public double helper(double x, long n) {
        if (n == 0 ){
            return 1;
        }
        else if (n<0){
            return 1.0/helper( x, -1*n );
        }
        
        // if ( x < 0.000001){
        //     return 0;
        // }
        
        
            // System.out.println(n);
            if (n%2 ==1 ){
                return x * helper(x*x, (n-1)/2);
            }
            else {
                return helper(x*x , (n)/2);
            }
    }

    public double myPow(double x, int n) {
        return helper (x, (long)n);
    }
}