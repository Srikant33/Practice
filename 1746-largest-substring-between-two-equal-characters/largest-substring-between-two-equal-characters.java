class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        int longest=-1;

        for (int i=0; i<s.length(); i++){
            longest = Math.max(longest, i - 1 - hm.getOrDefault(s.charAt(i), s.length()) );
            if (!hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),i);
            }

            // System.out.println(s.charAt(i)+" "+ longest);
        }

        return longest;
    }
}