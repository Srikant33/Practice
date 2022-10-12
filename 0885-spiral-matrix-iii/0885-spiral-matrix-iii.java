class Solution {
    HashSet<Pair<Integer, Integer>> hs = new HashSet<>();
    //0 -right  1-down - 2- left - 3-up
    
    
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int [][] res = new int[rows*cols][2];
        int dir =0;
        int count =0;
        while (count <rows*cols){
            // System.out.println(rStart+ " "+cStart+" "+hs+ " "+ count);
            hs.add(new Pair<>(rStart, cStart));
            if (rStart<rows && rStart>=0 && cStart>=0 && cStart<cols){
                res[count][0]=rStart;
                res[count][1]=cStart;
                count++;
            }
            
            
            if (dir == 1){
                if (!hs.contains(new Pair<>(rStart +1, cStart))){
                    dir++;
                    rStart++;
                }
                else{
                    cStart++;
                }
            }
            
            else if (dir == 2){
                if (!hs.contains(new Pair<>(rStart, cStart-1))){
                    dir++;
                    cStart--;
                }
                else{
                    rStart++;
                }
            }
            
            else if (dir == 3){
                if (!hs.contains(new Pair<>(rStart-1, cStart))){
                    dir=0;
                    rStart--;
                }
                else{
                    cStart--;
                }
            }
            
            else if (dir == 0){
                if (!hs.contains(new Pair<>(rStart, cStart+1))){
                    dir++;
                    cStart++;
                }
                else{
                    rStart--;
                }
            }
            
        }
        
        return res;
    }
}