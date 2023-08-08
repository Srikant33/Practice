class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length()!= t.length()){
            return false; 
        } 
        HashMap<Character, Character> hm = new HashMap<>();
        HashMap<Character, Character> rev = new HashMap<>();
        
        for (int i=0; i<s.length(); i++){
            if (hm.containsKey(s.charAt(i)) && hm.get(s.charAt(i))!= t.charAt(i)){
                return false;
            }
            if (rev.containsKey(t.charAt(i)) && rev.get(t.charAt(i))!= s.charAt(i)){
                return false;
            }
            hm.put(s.charAt(i), t.charAt(i));
            rev.put(t.charAt(i), s.charAt(i));
        }

        return true;
    }
}