class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> l = new LinkedList<>();
        int f=0, s=0;
        
        while (f<firstList.length && s<secondList.length){
            if ((firstList[f][1]>=secondList[s][0] && firstList[f][0]<=secondList[s][0]) || (firstList[f][0]<=secondList[s][1] && firstList[f][0]>=secondList[s][0]) ){
                l.add(new int[]{Math.max(firstList[f][0], secondList[s][0]), Math.min(firstList[f][1], secondList[s][1])});
            }
            if (firstList[f][1]>=secondList[s][1]) {s++; } else f++;
        }
        // System.out.println(l.get(0)[0]);
        int[][] ret= new int[l.size()][2];
        for (int i=0 ;i<l.size(); i++){
            ret[i] = l.get(i);
        }
        return ret;
        
    }
}