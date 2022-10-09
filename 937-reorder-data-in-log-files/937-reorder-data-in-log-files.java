class Solution {
    public String[] reorderLogFiles(String[] logs) {
        // PriorityQueue<String> pq= new PriorityQueue<>((a,b)-> (a.split(" ",2)[1].compareTo(b.split(" ",2)[1])==0)? b.split(" ",2)[0].compareTo(a.split(" ",2)[0])
                                                      // : b.split(" ",2)[1].compareTo(a.split(" ",2)[1]));
        List<String> lex= new LinkedList<>();
        List<String> ret= new LinkedList<>();
        
        for (String log: logs){
            String[] s = log.split(" ",2);
            if (Character.isDigit(s[1].charAt(0))){
                ret.add(log);
            }
            else {
                lex.add(log);
            }
        }
        
        Collections.sort(lex,(a,b)-> (a.split(" ",2)[1].compareTo(b.split(" ",2)[1])==0)? b.split(" ",2)[0].compareTo(a.split(" ",2)[0])
                                                      : b.split(" ",2)[1].compareTo(a.split(" ",2)[1]) );
        
        for (String s:lex){
            ret.add(0,s);
        }
        
        return ret.toArray(new String[logs.length]);
        
    }
}