class Solution {
    public int compress(char[] chars) {
        // make a output string and convert it to char[]
        // declair current char , and its count, stringBuilder to store 
        char curr = chars[0];
        int count = 1;
        StringBuilder sb = new StringBuilder();

        // looping through the array 
        for (int i=1; i<chars.length; i++){
            if (chars[i]== curr){
                count++;
            }
            
            // when the char changes 
            else {
                // adding char
                sb.append(curr);
                //adding count 
                if (count >1){
                    sb.append(String.valueOf(count));
                }
                //retsetting
                curr = chars[i];
                count =1;
            }
            // System.out.println(sb.toString());
        }
        
         // handling last char
        sb.append(curr);
        //adding count 
        if (count >1){
            sb.append(String.valueOf(count));
        }
        // replacing array
        char[] c =sb.toString().toCharArray();
        for (int i=0; i<sb.length(); i++){
            chars[i]= c[i];
        }
        
        return c.length;
    }
}