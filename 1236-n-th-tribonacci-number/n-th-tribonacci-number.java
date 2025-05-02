class Solution {
    public int tribonacci(int n) {
        if (n==0){
            return 0;
        }
        else if (n==1 || n==2){
            return 1;
        }
        int n1=0, n2=1 , n3=1, sum=0;
        while (n!=2){
            sum=n1+n2+n3;
            n1=n2;
            n2=n3;
            n3=sum;
            n--;
        }

        return n3;

    }
}