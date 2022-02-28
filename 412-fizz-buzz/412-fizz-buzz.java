class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ret=new ArrayList<String>();
        for (int i=1;i<=n;i++){
            String s="";
            if (i%3==0)
                s+="Fizz";
            if (i%5==0)
                s+="Buzz";
            if (i%3!=0 && i%5!=0)
                s+=Integer.toString(i);
            ret.add(s);
        }
        return ret;
    }
}