class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        HashSet<Character> hs = new HashSet<>();

        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (hs.contains(c)){
                continue;
            }
            else if (hm.containsKey(c)){
                hm.remove(c);
                hs.add(c);
            }
            else {
                hm.put(c, i);
            }
        }

        if (hm.size()==0){
            return -1;
        }
        List<Integer> l = new LinkedList<>(hm.values());
        Collections.sort(l);
        return l.get(0);

    }
}