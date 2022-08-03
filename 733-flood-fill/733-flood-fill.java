class Solution {
    public int[][] dfs(int[][] image, int sr, int sc, int color, int original, boolean[][] visited) {
        if (sr>=image.length || sr<0 || sc>=image[0].length || sc<0 || image[sr][sc]!=original || visited[sr][sc]==true){
            return image;
        }
        else {
            visited[sr][sc] = true;
            image[sr][sc] = color;
        }
        image = dfs(image, sr+1, sc, color, original, visited);
        image = dfs(image, sr, sc+1, color, original, visited);
        image = dfs(image, sr-1, sc, color, original, visited);
        image = dfs(image, sr, sc-1, color, original, visited);
        
        return image;
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original = image[sr][sc]; 
        boolean[][] visited= new boolean[image.length][image[0].length];
        return dfs(image, sr, sc, color, original, visited);
        
    }
}