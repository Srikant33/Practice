class Solution {
    public int compress(char[] chars) {
        if (chars.length==0){
            return 0;
        }
        char prev= chars[0];
        int pos=0, count=1, len=0;
        for (int i=1; i<chars.length; i++ ){
            if (chars[i]==prev){
                count++;
            }
            else{
                if (count ==1 ){
                    len= len+1;
                    chars[pos]=prev;
                    pos++;
                }
                else{
                    len=len+1;
                    chars[pos]=prev;
                    pos++;
                    String s= String.valueOf(count);

                    for (int j=0; j<s.length(); j++){
                        chars[pos]= s.charAt(j);
                        pos++;
                        len++;
                    }
                }
                count=1;
                prev=chars[i];
            }
        }
        if (count ==1 ){
            len= len+1;
            chars[pos]=prev;
            pos++;
        }
        else{
            len=len+1;
            chars[pos]=prev;
            pos++;
            String s= String.valueOf(count);
            for (int j=0; j<s.length(); j++){
                chars[pos]= s.charAt(j);
                pos++;
                len++;
            }
        }

        // chars[pos]=prev;
        // pos++;
        // chars[pos]=(char)(count+'0');
        return len;
    }
}