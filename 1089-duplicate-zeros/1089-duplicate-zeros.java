class Solution {
    public void duplicateZeros(int[] arr) {
        for (int i=0; i<arr.length;i++){
            if( arr[i] == 0){
                int a=arr.length-1;
                while (a>i+1){
                    arr[a]=arr[a-1];
                    a--;
                }
                if (i+1<arr.length){
                    i++;
                    arr[i]=0;
                }
            }
        }
        
    }
}