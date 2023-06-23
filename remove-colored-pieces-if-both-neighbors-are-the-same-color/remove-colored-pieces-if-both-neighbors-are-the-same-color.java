class Solution {
    public boolean winnerOfGame(String colors) {
        char prev = 'c';
        int c=0;
        int t_a=0, t_b=0;
        for(char color: colors.toCharArray()){
            if (color != prev){
                c=0;
            }

            c++;

            if (color == 'A'){
                prev = 'A';
            }
            else {
                prev = 'B';
            }

            if (c>2){
                if (color == 'A' ){
                    t_a++;
                }
                else {
                    t_b++;
                }
            }

            // System.out.println(c+" "+prev+" "+t_a+" "+ t_b);

        }
        // System.out.println(t_a+" "+ t_b);
        return (t_a>t_b?true:false);
    }
}