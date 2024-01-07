class Solution {
    public boolean isPrime(int x){
        if (x<2){
            return false;
        }
        for (int i=2;i<=x/2; i++){
            if ((x%i)==0){
                return false;
            }
        }
        return true;
    }

    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for (int i=left; i<=right; i++){
            if (isPrime(Integer.bitCount(i))){
                // System.out.println(Integer.bitCount(i));
                count++;
            }
        }
        return count;
    }
}