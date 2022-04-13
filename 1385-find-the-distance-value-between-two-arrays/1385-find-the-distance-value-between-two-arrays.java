class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count=arr1.length;
        for (int i=0;i<arr1.length; i++){
            int low=0, high = arr2.length-1 , mid, min= arr2[arr2.length-1];
            while (low<= high){
                mid=low+(high-low)/2;
                min=Math.min(min, Math.abs(arr1[i]-arr2[mid]));
                if (Math.abs(arr1[i]- arr2[mid])<=d){
                    count--;
                    low=high+1;
                }
                else if ((arr1[i]< arr2[mid])) {
                    high=mid-1;
                }
                else 
                    low=mid+1;
                System.out.print(arr1[i]+" "+min+ " ");
            }
            
            System.out.println("");
            // if (min>d){
            //     count++;
            // }
        }
        return count;
    }
}