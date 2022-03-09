class Solution {
    public int tribonacci(int n) {
        int f=0, s=1, t=1, temp;
        if (n ==0 || n==1){
            return n;
        }
        else if (n==2) {
            return 1;
        }
        while (n>2){
            temp=f;
            f=s;
            s = t;
            t= temp+f+s;
            n--;
        }
        return t;
    }
}