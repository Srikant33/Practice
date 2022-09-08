class BrowserHistory {
    String curr;
    Stack<String> back;
    Stack<String> forward;
    
    public BrowserHistory(String homepage) {
        curr = homepage;
        back = new Stack<>();
        forward = new Stack<>();
    }
    
    public void visit(String url) {
        forward.clear();
        back.push(curr);
        curr = url;
    }
    
    public String back(int steps) {
        while (!back.isEmpty()){
            forward.push(curr);
            curr = back.pop();
            steps--;
            if (steps == 0){
                return curr;
            }
        }   
        return curr;
    }
    
    public String forward(int steps) {
        while (!forward.isEmpty()){
            back.push(curr);
            curr = forward.pop();
            steps--;
            if(steps == 0){
                return curr;
            }
        }
        return curr;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */