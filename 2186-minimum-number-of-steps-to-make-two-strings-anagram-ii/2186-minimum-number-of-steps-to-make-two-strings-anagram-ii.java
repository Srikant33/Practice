class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character, Integer> hm= new HashMap<>();
        
        for(char c: s.toCharArray()){
            hm.put(c, hm.getOrDefault(c, 0)+1);
        }
        
        int count=0;
        for(char c: t.toCharArray()){
            if(hm.containsKey(c) && hm.get(c)>0){
                hm.put(c, hm.get(c)-1);
            }else{
                count++;
            }
        }
        System.out.println(count);
        for (int i: hm.values()){
            count+=i;
        }
        
        return count;
    }
}