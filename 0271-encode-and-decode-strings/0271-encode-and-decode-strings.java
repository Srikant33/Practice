public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s: strs){
            sb.append(s+"ā");
        }
        
        return sb.toString().substring(0,sb.length()-1);
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        // System.out.println(s);
        // String[] sp = s.split(",");
        // System.out.println(sp.length);
        List<String > ret = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)=='ā'){
                ret.add(sb.toString());
                sb.setLength(0);
                continue;
            }
            else {
                sb.append(s.charAt(i));
            }
        }
        ret.add(sb.toString());
        
        return ret;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));