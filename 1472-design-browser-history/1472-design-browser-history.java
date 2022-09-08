class BrowserHistory {
    int p=-1;
    List<String> l;
    public BrowserHistory(String homepage) {
        l= new LinkedList<String>();
        l.add(homepage);
        p++;
    }
    
    public void visit(String url) {
        l=l.subList(0,p+1);
        l.add(url);
        p++;
    }
    
    public String back(int steps) {
        p=Math.max(p-steps, 0);
        return l.get(p);
    }
    
    public String forward(int steps) {
        p=Math.min(p+steps, l.size()-1);
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