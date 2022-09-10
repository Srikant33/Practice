class Solution {
    int dest;
    List<List<Integer>> result;
    HashMap<Integer, List<Integer>> hm;
    
    protected void backtracking(int cur , LinkedList<Integer> path){
        // System.out.println(cur);
        if (cur == dest){
            // path.addLast(cur);
            result.add(new ArrayList<>(path));
            return;
        }
        
        for (int i: hm.getOrDefault(cur, new LinkedList<>())){
            path.addLast(i);
            backtracking(i, path);
            path.removeLast();
        }
    }
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        hm = new HashMap<>();
        for (int i=0 ; i<graph.length; i++){
            for (int j: graph[i]){
                List<Integer> l = hm.getOrDefault(i, new LinkedList<>());     
                l.add(j);
                hm.put(i, l);
            }
        }
        // System.out.println(hm);
        dest = graph.length -1;
        result = new LinkedList<>();
        LinkedList<Integer> path = new LinkedList<>();
        path.add(0);
        backtracking(0, path);
        return result;
    }
}