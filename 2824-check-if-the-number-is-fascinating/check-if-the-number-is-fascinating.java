class Solution {
    public boolean isFascinating(int n) {
        int d= n*2;
        int t= n*3;

        HashSet<Integer> hs = new HashSet<>();

        int x = 0;
        StringBuilder sb = new StringBuilder();

        sb.append(String.valueOf(n));
        sb.append(String.valueOf(t));
        sb.append(String.valueOf(d));

        // System.out.println(sb);
        if (sb.length()>9){
            return false;
        }

        x= Integer.valueOf(sb.toString());
        while (x>0){
            // System.out.println(x);
            int u = (int)(x%10);
            x = x/10;

            if(u==0 || hs.contains(u)){
                // System.out.println(u);
                return false;
            }
            else {
                hs.add(u);
            }
        }

        return true;
    }
}