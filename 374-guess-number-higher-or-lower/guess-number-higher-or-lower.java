/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    
    
    public int guessNumber(int n) {
        // brute force increase by 1 
        // optimised binary search

        //  vars
        int min = 1;
        int max = Integer.MAX_VALUE;

        while (true){
            int num = min+((max-min)/2); 
            int res = guess(num);
            // System.out.println(num+" "+ res);
            // we found the number 
            if (res == 0){
                return num;
            }

            // we guersses lower 
            else if (res>0){
                min = num +1 ;
            }
            // we guessed hiher
            else{
                max = num-1;
            }
        }

    }
}