class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sa=s.toCharArray();
        char[] ta=t.toCharArray();
        Arrays.sort(ta);
        Arrays.sort(sa);
        s=new String(sa);
        t=new String(ta);
        System.out.println(s);
        System.out.println(t);
        if(s.equals(t))
            return true;
        else
            return false;
    }
}