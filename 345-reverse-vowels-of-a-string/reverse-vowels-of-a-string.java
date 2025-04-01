class Solution {
    public String reverseVowels(String s) {
        // declair the vowels 
        HashSet<Character> hs = new HashSet<>(Arrays.asList('A','E','I','O','U','a','e','i','o','u'));

        // have a 2 pointer approach for right and left pointer 
        // when we have vowels in both sides we swithch

        int start = 0;
        int end = s.length()-1;
        char temp;
        StringBuilder sb= new StringBuilder();
        sb.append(s);

        // looping through the string
        while (start < end){
            if (hs.contains(s.charAt(start)) && hs.contains(s.charAt(end))){
                if (s.charAt(start)== s.charAt(end)){
                    start++;
                    end--;
                    continue;
                }
                //swap
                temp = s.charAt(start);
                sb.replace(start, start+1, s.charAt(end)+"");
                // System.out.println(end);
                sb.replace(end, end+1, temp+"");
                start++;
                end--;
            }
            else{
                // move till both are vowels
                if (!hs.contains(s.charAt(start))){
                    start++;
                }
                if (!hs.contains(s.charAt(end))){
                    end--;
                }
            }

        }

        //return new string
        return sb.toString();
    }
}