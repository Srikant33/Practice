class Solution {
    public void duplicateZeros(int[] arr) {
        int[] ret= new int[arr.length*2];
        int j=0;
        for (int i=0; i<arr.length; i++ ){
            if (arr[i]==0){
                ret[j]=0;
                j++;
                ret[j]=0;
                j++;
            }
            else{
                ret[j]=arr[i];
                j++;
            }
        }
        
       for (int i=0; i<arr.length; i++ ){
            arr[i]=ret[i];
       }
    }
}