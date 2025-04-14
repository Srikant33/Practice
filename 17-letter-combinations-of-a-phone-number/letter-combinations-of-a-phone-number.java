class Solution {
    public List<String> letterCombinations(String digits) {
        // hashmap of chars 
        // backtracking to make strings 
        HashMap<Character, String> hm = new HashMap<>();

        //populating 
        hm.put('2', "abc");
        hm.put('3', "def");
        hm.put('4', "ghi");
        hm.put('5', "jkl");
        hm.put('6', "mno");
        hm.put('7', "pqrs");
        hm.put('8', "tuv");
        hm.put('9', "wxyz");

        List<String> l = new ArrayList<>(); 
        List<String> l2 = new ArrayList<>();
        for (char digit: digits.toCharArray()){
            if (l.size() ==0){
                 l.add("");
            }
            for (String s: l){
                for (char c: hm.get(digit).toCharArray()){
                    l2.add(s+""+c);
                }
            }
            l=l2;
            l2= new ArrayList<>();
        }
        
        return l;        
    }
}