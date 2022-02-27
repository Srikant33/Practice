class Solution {
    public int minPartitions(String n) {
        int y,max=0;
        for (char a: n.toCharArray()){
            y=Character.getNumericValue(a);
            max=Math.max(max, y);
            //System.out.println(y);
        }
        return max;
    }
}