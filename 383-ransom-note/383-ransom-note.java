class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map= new HashMap<Character, Integer>();
        char[] rand=ransomNote.toCharArray();
        char[] mag=magazine.toCharArray();
        
        for (int i=0;i<mag.length;i++){
            if (map.containsKey(mag[i])){
                map.put(mag[i],map.get(mag[i])+1);
            }
            else
                map.put(mag[i],1);
        } 
        for (int i=0;i<rand.length;i++){
            if (map.containsKey(rand[i]) && map.get(rand[i])>0){
                map.put(rand[i],map.get(rand[i])-1);
            }
            else
                return false;
        } 
        return true;
    }
}