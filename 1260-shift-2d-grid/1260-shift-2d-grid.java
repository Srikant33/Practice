class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m= grid.length ,n= grid[0].length;
        int[][] arr= new int[m][n];
        for (int i=0;i<m; i++){
            for (int j=0;j<n;j++){
                int pos=(i*(n)+j)+k;
                int i1= pos/n;
                int j1= pos%n;
                while (i1>m-1){
                    i1-=m;
                }
                arr[i1][j1]=grid[i][j];
                // System.out.print(arr[i][j]);
            }
        }
        List <List<Integer>> ll= new ArrayList<>();

        for (int i=0;i<m; i++){
            List<Integer> l= new ArrayList<>();
            for (int j=0;j<n;j++){
                l.add(arr[i][j]);
            }
            ll.add(l);
        }
        return ll;        
    }
}