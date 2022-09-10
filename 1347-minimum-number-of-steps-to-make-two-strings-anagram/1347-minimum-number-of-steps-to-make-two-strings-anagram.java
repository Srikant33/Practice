class Solution {
    public int minSteps(String s, String t) {
        int[] cs = new int[26];
        int[] ct = new int[26];
        for (char c:s.toCharArray()) cs[c-'a']++;
        for (char c:t.toCharArray()) ct[c-'a']++;
        
        int res=0;
        for (int i=0; i<26; i++) res+= Math.max(cs[i]-ct[i],0);
        
        return res;
    }
}