class Solution {
    // int[] 
    public int fib(int n) {
        int[] a= new int[n+1];
        if (n==0){
            a[0]=0;
        }
        else if (n==1){
            a[1]=1;
        }
        else{
            a[n]=fib(n-1)+fib(n-2);
        }
        return a[n];
    }
}