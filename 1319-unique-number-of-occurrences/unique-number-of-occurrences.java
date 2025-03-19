class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // creating a hashMap of count
        HashMap<Integer, Integer> set= new HashMap<>();

        //looping through the Array
        for (int a: arr){
            //add to hashMap
            set.put(a, set.getOrDefault(a,0)+1);
        }

        //Cretae hashSet of occurence 
        Set<Integer> count = new HashSet<>();

        //looping though valueSet
        for (int i: set.values()){
            // if there is dupe 
            if (count.contains(i)){
                return false;
            }
            //adding to hashSet
            count.add(i);
        }

        //return if unique
        return true;
    }
}