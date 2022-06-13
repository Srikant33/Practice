class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size()==0){
            return -1;
        }
        for (int i = triangle.size()-2; i>-1; i--){
            for (int j = 0; j<triangle.get(i).size(); j++){ 
                // System.out.println(triangle.get(i).get(j)+ " "+i +" "+j);
                triangle.get(i).set(j, Math.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1)) + triangle.get(i).get(j));
            }
        }
        return triangle.get(0).get(0);
    }
}