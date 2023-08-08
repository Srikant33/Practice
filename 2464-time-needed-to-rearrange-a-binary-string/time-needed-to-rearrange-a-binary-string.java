class Solution {
    public int secondsToRemoveOccurrences(String s) {
        int count =0;
        while (s.contains("01")){
            count++;
            s =s.replace("01", "10");
            // System.out.println(s);
        }
        return count;
    }
}