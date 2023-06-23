class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int longest=0;
        char s='A';
        int i=0;
        for (char c : keysPressed.toCharArray()){
            if (i==0){
                hm.put (c, (hm.getOrDefault(c,0)>releaseTimes[0]? hm.get(c): releaseTimes[0]));
            }
            else {
                hm.put (c, (hm.getOrDefault(c,0)>releaseTimes[i]-releaseTimes[i-1]? hm.get(c): releaseTimes[i]-releaseTimes[i-1]));
            }

            i++;
            
            if (hm.get(c)>=longest){
                System.out.println(hm.get(c));
                
                if (hm.get(c) == longest){
                    s= ((int)s >= (int)c ? s : c);  
                }
                else {
                    longest = hm.get(c);
                    s=c;
                }
            }
        }

        return s;
    }
}