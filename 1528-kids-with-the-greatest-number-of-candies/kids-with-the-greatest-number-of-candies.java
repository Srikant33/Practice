class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // find max number of candies a child has 
        int max= 0;
        for (int c: candies ){
            max= Math.max(max, c);
        }

        //make boolean array 
        // boolean[] res = new boolean[candies.length];
        List<Boolean> res= new LinkedList<>();

        //chck if adding extra will be greater than or eqal to max
        for (int i=0; i<candies.length; i++){
            res.add(candies[i]+extraCandies >= max);             
        }

        //return res
        return res;
    }
}