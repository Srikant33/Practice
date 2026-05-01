class Solution {
    public int countDigits(int num) {
        int copy= num;
        int res=0; 

        while (copy>0){
            if (num % (copy%10)==0){
                res++;
            }
            copy /=10;

        }
        return res;
    }
}