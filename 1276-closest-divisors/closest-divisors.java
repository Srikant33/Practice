class Solution {
    public int[] closestFactor(int num){
        int min = num;
        int one = -1;
        for (int i=(int)Math.ceil(Math.sqrt(num)); i>=0 ; i--){
            if (num%i==0){
                if ( Math.abs(i-num/i) <min){
                    min=  Math.abs(i-num/i);
                    one =i;
                    break;
                }
            }
        }

        return new int[]{one, num/one};
    }
    public int[] closestDivisors(int num) {
        int[] one = closestFactor(num+1);
        int[] two= closestFactor(num+2);
        return Math.abs(one[0]-one[1])>Math.abs(two[0]-two[1])? two : one;
    }
}