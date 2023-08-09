class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> l = new LinkedList<>();
        int carry =1 ;
        int temp =-1;
        for (int i=digits.length-1; i>=0; i--){
            temp = digits[i]+carry;
            carry = (int)(temp/10);
            temp = temp %10;
            l.add(0, temp);
        }
        // System.out.println(carry);
        if (carry == 1){
            // System.out.println("aa");
            l.add(0, carry);
        }
        return l.stream().mapToInt(Integer :: intValue).toArray();
    }
}