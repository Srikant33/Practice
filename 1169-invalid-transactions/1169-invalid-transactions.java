class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        HashSet<trans> hs= new HashSet<>();
        HashMap<String, List<trans>> hm= new HashMap<>();
        
        for (String s:transactions){
            trans t = new trans(s);
            if (t.amt > 1000){
                hs.add(t);
            }
            
            List<trans> list;
            if (!hm.containsKey(t.name)){
                list =new LinkedList<>();
            }
            else{
                list = hm.get(t.name);
                for (trans l: list){
                    if (Math.abs(l.time-t.time)<=60 && !l.city.equals(t.city)){
                        hs.add(t);
                        hs.add(l);
                    }
                }
            }
            list.add(t);
            hm.put(t.name, list);
            
        }
        List<String> ret = new LinkedList<>();
        for (trans t:hs){
            ret.add(t.toString());
        }
        
        return ret;
    }
    
    public class trans{
        String name; 
        int amt;
        int time;
        String city;
        trans(String s){
            this(s.split(","));
        }
        trans(String[] s){
            this(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]),s[3]);
        }
        trans(String name, int time, int amt, String city){
            this.name = name; 
            this.time= time; 
            this.amt= amt;
            this.city= city;
        }
        
        public String toString(){
            return name+","+time+","+amt+","+city;
        }
    }
}