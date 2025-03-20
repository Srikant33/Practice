class Solution {
    public int equalPairs(int[][] grid) {
        //Create 2 frequency maops and multiply the same values to get result
        //creating maps
        Map<String, Integer> row= new HashMap<>();
        Map<String, Integer> col= new HashMap<>();
        
        //looping through rows and cols to populate HM
        //rows
        for (int i=0; i<grid.length;i++){
            //to store hm
            StringBuilder sb = new StringBuilder();
            for (int j=0; j<grid[0].length; j++){
                sb.append(grid[i][j]);
                sb.append("_");
            }
            //add to row hm
            row.put(sb.toString(), row.getOrDefault(sb.toString(),0)+1);
        }

        //cols
        for (int j=0; j<grid[0].length;j++){
            //to store hm
            StringBuilder sb = new StringBuilder();
            for (int i=0; i<grid.length; i++){
                sb.append(grid[i][j]);
                sb.append("_");
            }
            //add to row hm
            col.put(sb.toString(), col.getOrDefault(sb.toString(),0)+1);
        }

        // System.out.println(row.entrySet());
        // System.out.println(col.entrySet());

        //retult storing 
        int res=0;
        for (Map.Entry<String, Integer> entry: row.entrySet()){
            res += entry.getValue() * col.getOrDefault(entry.getKey(),0);
        }

        return res;
    }
}