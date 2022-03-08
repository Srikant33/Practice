class Solution {
    // int[] 
    public int fib(int n) {
        // int[] a= new int[n+1];
        if (n==0){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
}