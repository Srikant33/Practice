class Solution {
    public int maxDiff(int num) {
        String s = Integer.toString(num);

        // System.out.println(s);

        
        int max=Integer.parseInt(s.replace(s.charAt(0),'9'));
        
        int min=Integer.parseInt(s.replace(s.charAt(0),'1'));

        if (max == num || min == num){
            char[] digits = s.toCharArray();

            if (max ==num){
                for (int i=1; i<digits.length; i++){
                    if (digits[i]!='9'){
                        max=Integer.parseInt(s.replace(s.charAt(i),'9'));
                        break;
                    }
                }
            }


            else if (min ==num){
                for (int i=1; i<digits.length; i++){
                    if (digits[i]!='0' && digits[i]!='1'){
                        min=Integer.parseInt(s.replace(s.charAt(i),'0'));
                        break;
                    }
                }
            }

        }

        // System.out.println(min+ " "+max);

        return max-min;
        
    }
}