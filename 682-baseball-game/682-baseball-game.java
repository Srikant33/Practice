class Solution {
    public int calPoints(String[] ops) {
        int sum=0;
        List<Integer> l=new ArrayList<>();
        int[] arr= new int[ops.length];
        for (int i=0;i<ops.length;i++){
            if (ops[i].equals("+")){
                l.add(l.get(l.size()-1)+l.get(l.size()-2));
                sum=sum+l.get(l.size()-1);
            }
            else if (ops[i].equals("C")){
                sum=sum-l.get(l.size()-1);
                l.remove(l.size()-1);
            }
            else if (ops[i].equals("D")){
                sum=sum+l.get(l.size()-1)*2;
                l.add(l.get(l.size()-1)*2);
            }
            else{
                l.add(Integer.parseInt(ops[i]));
                sum=sum+Integer.parseInt(ops[i]);
            }
        }
        return sum;
    }
}