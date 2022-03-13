class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm= new HashMap<>();
        for (int i=0;i<strs.length; i++){
            String sorted = strs[i];
            char[] temp=sorted.toCharArray();
            Arrays.sort(temp);
            sorted=new String(temp);
            System.out.println(sorted);
            if (hm.containsKey(sorted)){
                hm.get(sorted).add(strs[i]);
                hm.put(sorted, hm.get(sorted)) ;
            }
            else{
                List<String> ll= new ArrayList<String>();
                ll.add(strs[i]);
                hm.put(sorted, ll );
            }
        }
        
        List<List<String>> ret = new ArrayList<>();
        
        for (List<String> l: hm.values()){
            ret.add(l);
        }
        
        return ret;
        
    }
}