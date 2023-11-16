class Solution {
    public String largestMerge(String word1, String word2) {
        int[] one = new int[word1.length()];
        int[] two = new int[word2.length()];

        int i=0;
        for (char c: word1.toCharArray()){
            one[i]=c-'a';
            i++;
        }
        
        i=0;
        for (char c: word2.toCharArray()){
            two[i]=c-'a';
            i++;
        }

        StringBuilder sb = new StringBuilder();

        int p1=0, p2=0; 
        while (p1<one.length && p2<two.length){
            int t1=p1;
            int t2=p2;
            int s1=0;
            int s2=0;
            while (s1 == s2){
                if (t1>=one.length){
                    s2=s1+1;
                    break;
                }
                else if (t2>=two.length){
                    s1=s2+1;
                    break;
                }
                s1+=one[t1];
                s2+=two[t2];
                t1++;
                t2++;
            }
            System.out.println(s1+" "+s2+" "+t1+ " "+t2);
            if (s1 > s2 ){
                // while (p1 < t1){
                    // sb.append('1');
                    sb.append((char)(one[p1]+'a'));
                    p1++;
                // }
            }
            else {
                // while (p2 < t2){
                    // sb.append('2');
                    sb.append((char)(two[p2]+'a'));
                    p2++;
                // }
            }

        }
        
        while (p1<one.length){
            sb.append((char)(one[p1++]+'a'));
        }
        
        while (p2<two.length){
            sb.append((char)(two[p2++]+'a'));
        }

        return sb.toString();
    }
}