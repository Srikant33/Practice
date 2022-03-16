class LRUCache {
    final Node head= new Node();
    final Node tail = new Node();
     HashMap<Integer, Node> hm;
    int GlobalCapacity;
    
    public LRUCache(int capacity) {
       hm = new HashMap<>(capacity);
       this.GlobalCapacity= capacity; 
       head.next=tail;
       tail.prev=head;
    }
    
    public int get(int key) {
        // System.out.println("get"+ key);
        int res=-1;
        Node node = hm.get(key);
        if (node!=null){
            res=node.val;
            remove(node);
            add(node);
        }
        return res;
    }
    
    public void put(int key, int value) {
        // System.out.println("Put"+ key + " "+ value);
        Node put_node= hm.get(key);
        Node node= new Node();
        node.key=key;
        node.val=value;
        if (put_node==null){

            

            if (hm.size() ==0){
                // System.out.println("space available" );
                hm.put(key, node);
                add (node);
            }
            else if (hm.size()<GlobalCapacity){
                // System.out.println("space available" );
                hm.put(key, node);
                add (node);
            }

            else if (hm.size() == GlobalCapacity){
                // System.out.println("space full" );
                hm.remove(tail.prev.key);
                remove(tail.prev);
                add(node);
                hm.put(key, node);
            }
        } else {
            remove(put_node);
            hm.remove(key);
            hm.put(key, node);
            add(node);
        }
        // System.out.println (hm);
    }
    
    public void remove(Node node){
        // System.out.println("Remove"+ node.key + " "+ node.val);
        Node next_node= node.next;
        Node prev_node = node.prev;
        
        next_node.prev =node.prev;
        prev_node.next =node.next;
    }
    
    public void add(Node node){
        // System.out.println("add"+ node.key + " "+ node.val);
        Node temp=head.next;
        head.next=node;
        node.prev=head;
        node.next=temp;
        node.next.prev=node;
    }
    
    class Node{
        int key;
        int val;
        Node prev;
        Node next;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */