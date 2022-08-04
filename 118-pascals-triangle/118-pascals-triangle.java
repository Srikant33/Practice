class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l= new  ArrayList<List<Integer>>();
        //List<Integer> ll = new ArrayList<Integer>();
        for (int i=0;i<numRows; i++){
            List<Integer> ll;
            l.add(ll= new ArrayList<Integer>());
            for (int j=0;j<=i; j++){
                if (j==0)
                    ll.add(1);
                else if (j==i)
                    ll.add(1);
                else
                    ll.add( l.get(i-1).get(j-1) + l.get(i-1).get(j) );
                
            }
            // System.out.println(ll);
            // l.add(ll);
            // System.out.println(l);
            // ll.clear();
            // System.out.println(l.get(0).get(0));
        }
        return l;
    }
}