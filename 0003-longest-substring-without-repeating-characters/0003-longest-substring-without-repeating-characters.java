class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        
        int l=0, r=0, maxLength=0; 
        
        while (r<s.length()){
            if (hs.contains(s.charAt(r))){
                
                hs.remove(s.charAt(l));
                l++;
                continue;
            }
            hs.add(s.charAt(r));
            r++;
            maxLength= Math.max(maxLength, r-l);
        }
        
        return maxLength;
    }
}