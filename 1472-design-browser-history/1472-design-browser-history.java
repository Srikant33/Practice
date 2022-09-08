class BrowserHistory {
    int p=-1;
    List<String> l;
    public BrowserHistory(String homepage) {
        l= new LinkedList<String>();
        l.add(homepage);
        // System.out.println(l);
        p++;
        // System.out.print(p);
    }
    
    public void visit(String url) {
        l=l.subList(0,p+1);
        // System.out.println(l);
        l.add(url);
        p++;
        // System.out.print(p);
    }
    
    public String back(int steps) {
        p=Math.max(p-steps, 0);
        // System.out.print(" b "+p);
        // System.out.println(l);
        return l.get(p);
    }
    
    public String forward(int steps) {
        p=Math.min(p+steps, l.size()-1);
        // System.out.print(" f "+p);
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