class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character, Integer> hs = new HashMap<>();
        for (char c: s.toCharArray()){
            hs.put(c, hs.getOrDefault(c, 0)+1);
        }
        int count =0;
        for (char c: t.toCharArray()){
            if (hs.containsKey(c) && hs.get(c)>0 ){
                hs.put(c, hs.get(c)-1);
            }
            else{
                count++;
            }
        }
        
        return count;
    }
}