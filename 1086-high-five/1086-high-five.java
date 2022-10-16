class Solution {
    public int[][] highFive(int[][] items) {
        HashMap<Integer, List<Integer>> hm = new HashMap<>();
        
        for (int[] item: items){
            List<Integer> list = hm.getOrDefault(item[0], new ArrayList<>());
            list.add(item[1]);
            hm.put(item[0], list);
        }
        
        int[][] ret = new int[hm.size()][2];
        int count =0;
        for (int i: hm.keySet()){
            List<Integer> list= hm.get(i);
            Collections.sort(list, Collections.reverseOrder());
            int sum=0;
            for (int j=0; j<5; j++){
                sum+=list.get(j);
            }
            
            ret[count][0]=i;
            ret[count++][1]=sum/5;
        }
        
        Arrays.sort(ret, (x,y)-> x[0]-y[0]);
        
        return ret;
    }
}