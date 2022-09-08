class BrowserHistory {
    int last =-1;
    int p=-1;
    List<String> l;
    public BrowserHistory(String homepage) {
        l= new ArrayList<String>();
        l.add(homepage);
        p++;
        last++;
    }
    
    public void visit(String url) {
        if(++p<l.size()){
            l.set(p, url);
        }
        else {
            l.add(url);
        }
        last=p;
    }
    
    public String back(int steps) {
        p=Math.max(p-steps, 0);
        return l.get(p);
    }
    
    public String forward(int steps) {
        p=Math.min(p+steps, last);
        return l.get(p);
        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */