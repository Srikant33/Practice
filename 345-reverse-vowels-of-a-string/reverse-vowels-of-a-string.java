class Solution {
    public String reverseVowels(String s) {
        // string to char arrya 
        // replace with 2 pointers
        
        //boolean of is vowel 
        boolean[] vowel = new boolean[128];

        for (char c: "aeiouAEIOU".toCharArray()){
            vowel[c]=true;
        }

        //declaring pointers
        int start =0;
        int end = s.length()-1;

        //string to char array
        char[] c = s.toCharArray();

        while (start<end){
            while (start<end && !vowel[c[start]]){
                start++;
            }
            while (start<end && !vowel[c[end]]){
                end--;
            }
            if (start<end){
                //swap
                char temp = c[start];
                c[start]=c[end];
                c[end]=temp;
                start++;
                end--;
            }
        }

        return String.valueOf(c);

    }
}