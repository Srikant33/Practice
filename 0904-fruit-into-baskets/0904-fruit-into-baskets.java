class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int l=0, r=0;
        int maxFruit=0;
        while (r<fruits.length){
            
            if (!hm.containsKey(fruits[r])){
                while (hm.size()==2){
                    hm.put(fruits[l], hm.get(fruits[l])-1);
                    if (hm.get(fruits[l]) ==0){
                        hm.remove(fruits[l]);
                    }
                    l++;
                }
            }
            
            hm.put(fruits[r], hm.getOrDefault(fruits[r],0)+1);
            
            if (r-l+1 > maxFruit){
                maxFruit=r-l+1;
            }
            r++;
        }
        return maxFruit;
                
                
                
    }
}