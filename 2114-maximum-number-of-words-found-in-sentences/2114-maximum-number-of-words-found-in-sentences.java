class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=0;
        int max=0;
        for (String sentence: sentences){
            count=1;
            for (int j=0 ;j< sentence.length();j++){
                if (sentence.charAt(j)==' ')
                    count++;
            }
            if (count>max){
                max=count;
            }
        }
        return max;
    }
}