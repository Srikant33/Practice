class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        //Creating HashSets
        Set<Integer> first= new HashSet<>();
        Set<Integer> second = new HashSet<>();

        //looping through first array 
        for (int num: nums1){
            first.add(num);
        }

        //looping through second array
        for (int num: nums2){
            second.add(num);
        }

        // Creating lists to store vals
        List<Integer> l1= new ArrayList<>();
        List<Integer> l2= new ArrayList<>();

        // creatig unique from num1
        for (int i: first){
            if (second.contains(i)){
                continue;
            }
            else {
                l1.add(i);
            }
        }
        
        // creatig unique from num2
        for (int i: second){
            if (first.contains(i)){
                continue;
            }
            else {
                l2.add(i);
            }
        }


        List<List<Integer>> res= new ArrayList();
        res.add(l1);
        res.add(l2);
        
        //return
        return res;
    }
}