class Solution {
    // int[] 
    public int fib(int n) {
        // int[] a= new int[n+1];
        if (n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}