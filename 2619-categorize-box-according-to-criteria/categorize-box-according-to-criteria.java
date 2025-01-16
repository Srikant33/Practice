class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean dim = length>=10000 || height>=10000|| width>=10000;
        long volume= (long)length*(long)width*(long)height;

        boolean bulky= dim || volume>=1000000000;
        boolean heavy= mass>=100;

        if (bulky && heavy){
            return "Both";
        }
        else if (!bulky && !heavy){
            return "Neither";
        }
        else if (bulky){
            return "Bulky";
        }
        else{
            return "Heavy";
        }
    }
}