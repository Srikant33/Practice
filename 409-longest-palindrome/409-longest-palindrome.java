class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int len=0;
        boolean flag= false;
        
        for (char c: s.toCharArray()){
            hm.put(c, hm.getOrDefault(c, 0)+1);
        }
        for (Map.Entry<Character, Integer> h: hm.entrySet()){
            if (flag == false && h.getValue()%2 == 1){
                flag= true;
            }
            len+=(h.getValue()/2)*2;    
        }
        if (flag == true){
            len++;
        }
        
        return len;
    }
}