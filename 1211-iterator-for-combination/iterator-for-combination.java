class CombinationIterator {
    Queue<String> l = new LinkedList<>();

    public CombinationIterator(String characters, int combinationLength) {
        

        char[] ch = characters.toCharArray();
        Arrays.sort(ch);

        helper(ch, combinationLength, new String());


        
    }

    public void helper(char[] ch, int len, String s){
       if (len==0){
            l.add(s);
            return ;
        }
        else if (ch.length<len){
            return;
        }
        
        for (int i=0; i<ch.length; i++){
            helper(Arrays.copyOfRange(ch,i+1,ch.length), len-1 , s+ch[i]);
        }

        return;
    }
    
    public String next() {
        return l.poll();
    }
    
    public boolean hasNext() {
        return !l.isEmpty();
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */