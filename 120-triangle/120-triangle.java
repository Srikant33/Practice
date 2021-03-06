class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for (int i = triangle.size()-2; i>-1; i--){
            for (int j = 0; j<triangle.get(i).size(); j++){ 
                triangle.get(i).set(j, Math.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1)) + triangle.get(i).get(j));
            }
        }
        return triangle.get(0).get(0);
    }
}