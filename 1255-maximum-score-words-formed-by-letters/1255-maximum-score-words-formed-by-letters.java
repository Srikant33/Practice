class Solution {
    HashMap<String, Integer> wei = new HashMap<>();
    int Gmax=0;
    HashMap<String, HashMap<Character, Integer>> wfreq = new HashMap<>();
        
    public int NewScore(String[] words, int curr, int score, HashMap<Character,Integer> freq){
        if (curr>=words.length){
            return score;
        } 
        boolean flag = true;
        // System.out.println(words[curr]+ " "+freq+ "  "+score);
        for (Map.Entry<Character, Integer> e: wfreq.get(words[curr]).entrySet()){
            if(!freq.containsKey(e.getKey()) || freq.get(e.getKey())-wfreq.get(words[curr]).get(e.getKey())<0){
                flag= false;      
            }
        }
        HashMap<Character, Integer> newfreq = new HashMap<>();
        for (Map.Entry<Character, Integer> e: freq.entrySet()){
                newfreq.put(e.getKey(), freq.get(e.getKey())-wfreq.get(words[curr]).getOrDefault(e.getKey(),0));
        }
        
        // System.out.println(words[curr]+ " "+freq+ " "+ newfreq+ " "+score);
        for (int i=curr+1; i<=words.length; i++ ){
            if (flag){
               Gmax=Math.max(Gmax, Math.max(NewScore(words, i, score, freq), NewScore(words, i, score+wei.get(words[curr]), newfreq)));
            }
            else{
               Gmax=Math.max(Gmax, NewScore(words, i, score, freq));
            }
        }        
        return Gmax; 
    }
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (String word: words){
            int weight = 0;
            HashMap<Character, Integer> f= new HashMap<>();
            for (char c:word.toCharArray()){
                weight+= score[c-'a'];
                f.put(c,f.getOrDefault(c,0)+1);
            }
            wfreq.put(word, f);
            wei.put(word, weight);
        }

        for (char c: letters){
            freq.put(c, freq.getOrDefault(c,0)+1);
        }

        return NewScore(words, 0, 0, freq);
        
    }
}