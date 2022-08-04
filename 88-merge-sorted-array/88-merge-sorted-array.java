class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i =m-1 ; i >=0 ; i--){
            // System.out.println(nums1[i]);
            nums1[i+n]= nums1[i];
        }
        int a=n, b=0;
        // System.out.println(nums1[n]);
        for (int i=0; i<m+n; i++){
            if (a<m+n && b<n){
                nums1[i]= Math.min(nums1[a], nums2[b]);
                if (nums1[a]<nums2[b]){
                    a++;
                }
                else {
                    b++;
                }
            } 
            else if (b<n){
                nums1[i]=nums2[b];
                b++;
            }
        }
    }
}