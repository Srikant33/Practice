class Solution {
    public String reformatDate(String date) {
        List<String> l = new LinkedList<>(Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"));

        String[] d = date.split(" ");

        d[0]= d[0].replaceAll("[a-zA-Z]","");
        // StringBuilder sb = new StringBuilder();
        d[1] = String.valueOf(l.indexOf(d[1])+1);
        if (d[0].length()<2){
            d[0]="0"+d[0];
        }
        if (d[1].length()<2){
            d[1]="0"+d[1];
        }
        
        // System.out.println(d[1]);

        return d[2]+"-"+d[1]+"-"+d[0];
    }
}