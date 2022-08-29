class OrderedStream {
    String[] s;
    int pt = 0; 
    public OrderedStream(int n) {
        s= new String[n];
    }
    
    public List<String> insert(int idKey, String value) {
        s[idKey-1] = value;
        List<String> l = new ArrayList<>();
        while (pt!=s.length && s[pt] != null){
            l.add(s[pt]);
            pt++;
        }
        return l;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */