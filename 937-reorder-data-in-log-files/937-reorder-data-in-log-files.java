class Solution {
    public String[] reorderLogFiles(String[] logs) {
        PriorityQueue<String> pq= new PriorityQueue<>((a,b)-> (a.split(" ",2)[1].compareTo(b.split(" ",2)[1])==0)? b.split(" ",2)[0].compareTo(a.split(" ",2)[0])
                                                      : b.split(" ",2)[1].compareTo(a.split(" ",2)[1]));
        
        List<String> ret= new LinkedList<>();
        
        for (String log: logs){
            String[] s = log.split(" ",2);
            if (Character.isDigit(s[1].charAt(0))){
                ret.add(log);
            }
            else {
                pq.add(log);
            }
        }
        
        while (!pq.isEmpty()){
            ret.add(0,pq.poll());
        }
        
        return ret.toArray(new String[logs.length]);
        
    }
}