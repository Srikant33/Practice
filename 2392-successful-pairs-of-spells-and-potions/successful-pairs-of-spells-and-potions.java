class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        //Sort portions arrays 
        Arrays.sort(potions);
        
        // make result arr
        int[] pairs = new int[spells.length];
        int i=0;


        //binary search first position that is larger than success - spells[i] for every element of spells
        for (int spell: spells){
            int min =0;
            int max =potions.length-1;
            double goal = (double)success / spell; 

            // binary search 
            while(min <=max) {
                int mid= min + (max-min)/2;
                // answer
                if (potions[mid] >= goal && (mid==0 || potions[mid-1] <goal)){
                    pairs[i]= potions.length - mid;
                    break;
                }
                // if we are ahead
                else if (potions[mid] >= goal &&  potions[mid-1] >=goal){
                    max= mid-1;
                }
                //if we are behind
                else{
                    min = mid+1;
                }
            }
            i++;
        }
        

        //return 
        return pairs;
    }
}