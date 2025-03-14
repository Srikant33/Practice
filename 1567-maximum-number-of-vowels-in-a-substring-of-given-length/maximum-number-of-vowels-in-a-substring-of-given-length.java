class Solution {
    public int maxVowels(String s, int k) {
        //declair var
        int vowels=0;
        int max=0;

        //getting inital window count
        for (int i=0; i<k; i++){
            if (s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u'){
                vowels++;
            }
        }
        max=vowels;

        // sliding window
        for (int i=k; i<s.length(); i++){
            if (s.charAt(i-k)=='a' ||s.charAt(i-k)=='e' ||s.charAt(i-k)=='i' ||s.charAt(i-k)=='o' ||s.charAt(i-k)=='u'){
                vowels--;
            }
            if (s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u'){
                vowels++;
            } 
            max=Math.max(max, vowels);
        }

        //return 
        return max;
    }
}