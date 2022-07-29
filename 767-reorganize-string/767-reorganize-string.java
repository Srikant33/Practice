class Solution {
    public String reorganizeString(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c :s.toCharArray()){
            hm.put (c, hm.getOrDefault(c, 0)+1);
        }
        
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b)-> b.f- a.f);
        
        for (Map.Entry<Character, Integer> e: hm.entrySet()){
        
            // System.out.println(e.getKey()+ " " +e.getValue());
            pq.add(new Node(e.getKey(), e.getValue()));
            // char a='a';
            // int b=10;
            // pq.add(new Node(a, b));
            
            // System.out.println(pq.peek().c);
        }
        
            // System.out.println(pq.poll().c);
        
        StringBuilder sb= new StringBuilder();
        
        while (pq.size()>1){
            Node e1 = pq.poll();
            Node e2 = pq.poll();
            sb.append((char)e1.c);
            sb.append((char)e2.c);
            // System.out.println((char)e2.c);
            if (e1.f-1>0){
                pq.add( new Node(e1.c, e1.f-1));
            }
            if (e2.f-1>0){
                pq.add( new Node(e2.c, e2.f-1));
            }
            
        }
        if (pq.size() == 1 ){
            if(pq.peek().f>1){
                return "";
            }
            else {
                sb.append(pq.poll().c);
                return sb.toString();
            }
        }
        return sb.toString();
    }
}

class Node{
    char c;
    int f;
    Node(char c,int f){
        this.c=c;
        this.f=f;
    }
}