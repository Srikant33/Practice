class Solution {
    LinkedList<String> ret=new LinkedList<String>();
    public List<String> fizzBuzz(int n) {
        if (n>0){
            if (n%3==0 && n%5==0){
                ret.addFirst("FizzBuzz");
            }
            else if (n%3 ==0 ){
                ret.addFirst("Fizz");
            }
            else if (n%5==0){
                ret.addFirst("Buzz");
            }
            else 
                ret.addFirst(String.valueOf(n));
            
            fizzBuzz(n-1);
        }
        return ret;
    }
}