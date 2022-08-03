class Solution {
    public int characterReplacement(String s, int k) {
        int max= Integer.MIN_VALUE;
        HashMap<Character, Integer> hm = new HashMap<>();
        int maxf=1;
        int i=0, j=0;
        
        while (j<s.length()){
            hm.put(s.charAt(j), hm.getOrDefault(s.charAt(j), 0)+1);
            maxf= (maxf> hm.get(s.charAt(j))) ? maxf : hm.get(s.charAt(j));
            if (j-i+1-maxf > k){
                hm.put(s.charAt(i), hm.getOrDefault( s.charAt(i), 0)-1);
                i++;
            }
            max= (j-i+1> max)?j-i+1:max;
            j++;
        }
        return max;
    }
}