class LRUCache {
    class Node {
        int key, value;
        Node prev, next;

        public Node(int key, int value){
            this.key= key; 
            this.value = value;
            this.prev = null; 
            this.next = null;
        }
    }
    int cap ;
    HashMap<Integer, Node> hm;
    Node l;
    Node r;
    

    public LRUCache(int capacity) {
        cap = capacity;
        hm = new HashMap<>();
        l = new Node(-1,-1);
        r = new Node(0,0);
        l.next = r;
        r.prev = l;
    }
    
    private void top(Node n){
        

        Node temp = r.prev;
        temp.next = n;
        n.next= r;
        r.prev= n;
        n.prev =temp;
    }

    private void rem(Node n){
        Node p = n.prev;
        Node nx = n.next;
        
        p.next = nx;
        nx.prev = p;
    }

    public int get(int key) {
        if (hm.containsKey(key)){
            rem(hm.get(key));
            top(hm.get(key));
            hm.remove(key);

            hm.put(key, r.prev);
            return hm.get(key).value;
        }
        else {
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if (hm.containsKey(key)){
            rem(hm.get(key));
            hm.remove(key);
        }

        
        Node temp= new Node(key, value);
        hm.put(key, temp);
        top(hm.get(key));
        // System.out.println(hm +" "+hm.size()+" "+l.next.key);
        if (hm.size()> cap){
            hm.remove(l.next.key);
            rem(l.next);
        }
        // System.out.println(hm);
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */