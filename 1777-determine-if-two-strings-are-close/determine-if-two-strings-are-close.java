class Solution {
    public boolean closeStrings(String word1, String word2) {
        // if frequency count of both the strings is same this will be possibele 
        // hash map of frequency 
        Map <Character, Integer> m1 = new HashMap<>();
        Map <Character, Integer> m2 = new HashMap<>();
        
        // getting frequency map
        for (char c: word1.toCharArray()){
            m1.put(c, m1.getOrDefault(c, 0)+1);
        }
        
        for (char c: word2.toCharArray()){
            m2.put(c, m2.getOrDefault(c, 0)+1);
        }

        // // get Set of frequcney 
        // HashSet<> s1 = new HashSet<>();
        // HashSet<> s2 = new HashSet<>();

        // for (int i: m1.values()){

        // }
        // // if element is left in word2
        // if (l2.size()>0){
        //     return false;
        // }
        List<Integer> list1 = new ArrayList<>(m1.values());
        List<Integer> list2 = new ArrayList<>(m2.values());

        Collections.sort(list1);
        Collections.sort(list2);

        List<Character> charlist1 = new ArrayList<>(m1.keySet());
        List<Character> charlist2 = new ArrayList<>(m2.keySet());

        Collections.sort(charlist1);
        Collections.sort(charlist2);

        return list1.equals(list2) && charlist1.equals(charlist2);

        // //  //both are same 
        //  return Collections.sort(new ArrayList(m1.values())).equals(Collections.sort(new ArrayList(m2.values())));
    }
}