class Solution {
    
    HashSet<Pair<Integer, Integer>> phs= new HashSet<>();
    HashSet<Pair<Integer, Integer>> ahs= new HashSet<>();
    int m, n;
    List<Pair<Integer, Integer>> pvisit = new LinkedList<>();
    List<Pair<Integer, Integer>> avisit = new LinkedList<>();
    
    public boolean pdfs(int[][] heights, int i, int j, int prev){
        // System.out.println(i+" "+j+" "+pvisit);
        
        if (i<0 || j<0 || (phs.contains(new Pair(i,j)) && heights[i][j]<=prev) ){
            return true;
        }
        else if (i==m || j==n || heights[i][j]>prev || pvisit.contains(new Pair(i,j))){
            return false;
        }
        pvisit.add(new Pair(i,j));
        boolean ret = pdfs(heights, i-1, j, heights[i][j]) || pdfs(heights, i+1, j, heights[i][j]) || pdfs(heights, i, j-1, heights[i][j]) || pdfs(heights, i, j+1, heights[i][j]);
        pvisit.remove(new Pair(i,j));
        if (ret){
            phs.add(new Pair(i,j));
        }
        return ret;
    }
    
    public boolean adfs(int[][] heights, int i, int j, int prev){
        // System.out.println(i+" "+j+" "+avisit);
        if (i==m || j==n|| (ahs.contains(new Pair(i,j)) && heights[i][j]<=prev) ){
            return true;
        }
        else if (i<0 || j<0 || heights[i][j]>prev || avisit.contains(new Pair(i,j))){
            return false;
        }
        avisit.add(new Pair(i,j));
        boolean ret = adfs(heights, i-1, j, heights[i][j]) || adfs(heights, i+1, j, heights[i][j]) || adfs(heights, i, j-1, heights[i][j]) || adfs(heights, i, j+1, heights[i][j]);
        avisit.remove(new Pair(i,j));
        if (ret){
            ahs.add(new Pair(i,j));
        }
        return ret;
    }
    
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        m= heights.length;
        n= heights[0].length;
        List<List<Integer>> ll= new LinkedList<>();
        
        for (int i=0;i<m; i++){
            for (int j=0; j<n; j++){
                if (pdfs(heights, i, j, Integer.MAX_VALUE) && adfs(heights, i, j, Integer.MAX_VALUE)){
                    List<Integer> l= Arrays.asList(i,j);
                    ll.add(l);
                }
            }
        }
        
        return ll;
    }
}