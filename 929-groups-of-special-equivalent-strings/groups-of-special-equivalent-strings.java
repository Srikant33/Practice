class Solution {

    public String helper(String word){
        List<Character> odd=new ArrayList<Character>();
        List<Character> even=new ArrayList<Character>();        

        for (int i=0; i<word.length(); i++){
            if (i%2==0){
                even.add(word.charAt(i));
            }
            else{
                odd.add(word.charAt(i));
            }
        }

        Collections.sort(odd);
        Collections.sort(even);
        
        StringBuilder sb = new StringBuilder();

        for (char c:odd){
            sb.append(c);
        }       
        for (char c:even){
            sb.append(c);
        }

        return sb.toString();
    }


    public int numSpecialEquivGroups(String[] words) {
        HashSet<String> hs= new HashSet<>();
        
        for (String word: words){
            hs.add(helper(word));
        }

        return hs.size();
    }
}