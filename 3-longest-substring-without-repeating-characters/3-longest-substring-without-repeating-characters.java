class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm=new HashMap<Character, Integer>();
        int max=0,count=0,from=-1;
        for (int i=0;i<s.length();i++){
            if (hm.containsKey(s.charAt(i))){
                if (hm.get(s.charAt(i))>from){
                    from =hm.get(s.charAt(i));
                }
            }
            
            hm.put(s.charAt(i),i);
            // System.out.println(s.charAt(i));
            count++;
            
            if (max < count-from-1 ){
                max=count-from-1;
            }
        }
        return max;
    }
}