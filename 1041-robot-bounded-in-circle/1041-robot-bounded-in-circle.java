class Solution {
    public boolean isRobotBounded(String instructions) {
        // int dir[]= new int[]{0,1,2,3};
        int k=0;
        int n=0, e=0;
        for (char c: instructions.toCharArray()){
            if (k<0){
                k=k+4;
            }
            k=k%4;
            
            if (c=='L'){
                k--;
            }
            else if (c=='R'){
                k++;
            }
            
            else {
                if (k==0){
                    n++;
                }
                else if (k==1){
                    e++;
                }
                else if (k==2){
                    n--;
                }
                else if (k==3){
                    e--;
                }
            }
        }
        if (k<0){
                k=k+4;
            }
        k=k%4;
        System.out.println(n+" "+e+ " "+k);
        return (n==0 && e==0) || k!=0;
    }
}