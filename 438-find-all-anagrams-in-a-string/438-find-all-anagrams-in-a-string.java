class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ret= new ArrayList<>();
        if(p.length()>s.length()){
            return ret;
        }
        
        HashMap<Character , Integer> hm = new HashMap<>();
        HashMap<Character , Integer> copy = new HashMap<>();
        int length= p.length();
        
        for (char c: p.toCharArray()){
            hm.put(c, hm.getOrDefault(c,0)+1);
        }
        
        for (int i=0; i<length ;i++){
            char c= s.charAt(i);
            copy.put(c, copy.getOrDefault(c, 0)+1);
        }
        
        for (int i=length; i<s.length(); i++){
            if (hm.equals(copy)){
                ret.add(i-length);
            }
            char c= s.charAt(i);
            char d= s.charAt(i-length);
            if (copy.containsKey(d)){
                if(copy.get(d)==1){
                    copy.remove(d);
                }
                else{
                    copy.put(d,copy.get(d)-1);
                }
            }
            copy.put(c,copy.getOrDefault(c,0)+1);
        }
        if (hm.equals(copy)){
                ret.add(s.length()-length);
        }
        return ret;
    }
}