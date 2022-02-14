class Solution {
    public String reverseWords(String s) {
        StringBuilder res= new StringBuilder();
        String words[]=s.split(" ");
        for (String i : words){
            res.append(new StringBuffer (i).reverse().toString()+" ");
        }
        return res.toString().trim();
    }
}