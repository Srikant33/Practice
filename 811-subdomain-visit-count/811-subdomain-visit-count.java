class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> hm =new HashMap<>();
        for (String s: cpdomains){
            String[] s2= s.split(" ");
            while (s2[1].length()>0){
                hm.put(s2[1], hm.getOrDefault(s2[1], 0)+ Integer.valueOf(s2[0]));
                if (s2[1].contains(".")){
                    s2[1] = s2[1].split("\\.",2)[1];
                }
                else{
                    s2[1]="";
                }
            }
        }
        List<String> l= new ArrayList<>();
        for (Map.Entry <String, Integer> e: hm.entrySet() ){
            l.add(e.getValue()+" "+e.getKey());
        }
        return l;
    }
}