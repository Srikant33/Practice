class Solution {
    int n1=0,n2=1,tem;
    public int fib(int n) {
        if (n==0){
            return 0;
        }
        while (n>1){
            tem=n2;
            n2=n2+n1;
            n1=tem;
            n--;
            
        }
        return n2;
    }
}