class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int m=nums1.length, n=nums2.length;
        HashMap <Integer, Integer> map=new HashMap<Integer,Integer>();
        for (int i=0;i<m;i++){
            if (map.containsKey(nums1[i])){
                map.put(nums1[i],map.get(nums1[i])+1);
                                //System.out.println(nums1[i]);

            }
            else
                map.put(nums1[i],1);
                                            System.out.println(nums1[i]);

        }
        int a=0;
        //System.out.println(map.get(9));
        for (int i=0;i<n;i++){
            if (map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                map.put(nums2[i],map.get(nums2[i])-1);
                System.out.println(map.get(9));
                nums2[a]=nums2[i];
                a++;
            }
        }
        int [] nums3=new int[a];
        for (int i=0;i<a;i++){
            nums3[i]=nums2[i];
        }
        return nums3;
        
    }
}