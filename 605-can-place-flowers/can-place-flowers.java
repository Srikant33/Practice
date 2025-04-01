class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // greedy algorithm 
        // check 3 positions if 0 plants there plant in center 
        for (int i=0; i<flowerbed.length; i++){
            if (flowerbed[i]==0 && (i==0 || flowerbed[i-1]==0) && (i==flowerbed.length-1 || flowerbed[i+1] ==0 )){
                flowerbed[i]=1;
                n--;
                
            }
            //wehn we placed all flowers 
            if (n<=0){
                return true;
            }
        }

        //if all flowers cant be placed 
        return false;
    }
}