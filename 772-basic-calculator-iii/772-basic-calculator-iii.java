class Solution {
    int idx ;
    public int calculate(String s) {
        int idx = 0; 
        return cal(s);
    }
    
    public int cal(String s){
        int num=0, res =0, prev =0; 
        char sign='+';
        
        while (idx < s.length() ){
            char c = s.charAt(idx++);
            // System.out.println(idx+ " " +s.length());
            if (c == '(') num = cal(s);
            else if (c>='0' && c<='9'){num = num*10 + (int) (c-'0');}
            if ( c== '+'|| c== '-'|| c== '*'||c== '/'||c== ')'|| idx == s.length()){
                // System.out.println(num);
                switch(sign){
                    case '+' : res+=prev; prev= num; break;
                    case '-' : res+=prev; prev= num * -1; break;
                    case '*' : prev *= num; break;
                    case '/' : prev /= num; break;
                }
                // System.out.println(sign + " "  + res + " " +prev+ " " + num);
                if (c == ')') return res+prev;
                sign = c;
                num = 0;
            }
        }
        // System.out.println(sign + " "  + res + " " +prev);
        return res+prev;
    }
}