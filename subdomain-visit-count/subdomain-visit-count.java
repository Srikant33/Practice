class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> hm = new HashMap<>();
        String[] rep= new String[2];
        for (String s: cpdomains){
            rep = s.split(" ");
            while (rep[1].length()>0){
                hm.put(rep[1], hm.getOrDefault(rep[1],0)+Integer.parseInt(rep[0]));
                int i=0;
                while(i<rep[1].length() && rep[1].charAt(i)!='.'){
                    i++;
                }
                rep[1] =rep[1].substring(Math.min(rep[1].length(),i+1),rep[1].length());
                System.out.println(rep[1]);
            }
        }

        List<String> l = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        
        for (String s : hm.keySet()){
            sb.append(hm.get(s));
            sb.append(" ");
            sb.append(s);

            l.add(sb.toString());
            sb.setLength(0);
        }

        return l;
    }
}