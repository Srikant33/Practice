class Solution {
    private class A implements Comparator<String>{
        public int compare(String a, String b){

                String x1= a+b;
                String y1 = b+a;
                // System.out.println(x1 +" "+y1);
                return y1.compareTo(x1);
            }
    }
    public String largestNumber(int[] nums) {
        int j=1,x;
        String[] asStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            asStrs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(asStrs, new A());
        if (asStrs[0].equals("0")){
            return "0";
        }
        String sb = new String();
        for (String i: asStrs){
            sb+= i;
        }
        return sb.toString();
    }
}