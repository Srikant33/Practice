class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Character, Integer > fm = new HashMap<>();
        
        for (char c : secret.toCharArray()){
            fm.put(c, fm.getOrDefault(c, 0)+1);
        }
        
        
        int a=0, b=0;
        for (int i=0; i<guess.length(); i++){
            if (guess.charAt(i)==secret.charAt(i)){
                a++;
                if (fm.get(guess.charAt(i))>0){
                    fm.put(guess.charAt(i), fm.get(guess.charAt(i))-1);
                }
                else {
                    b--;
                }
            }
            else if (fm.containsKey(guess.charAt(i)) && fm.get(guess.charAt(i))>0){
                b++;
                fm.put(guess.charAt(i), fm.get(guess.charAt(i))-1);
            }
        }
        
        return String.valueOf(a)+"A"+String.valueOf(b)+"B";
        
        
    }
}