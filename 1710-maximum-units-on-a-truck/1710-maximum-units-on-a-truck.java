class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (x,y)-> y[1]-x[1]);
        
        int box=0, count =0;
        while (truckSize > 0){
            if (boxTypes[box][0] == 0){
                box++;
                if (box == boxTypes.length){
                    break;
                }
            }
            count += boxTypes[box][1];
            boxTypes[box][0]--;
            truckSize--;
            
        }
        
        return count;
    }
}