class Solution {
    public boolean increasingTriplet(int[] nums) {
        // declair 2 var and if there is a var more than both that is the answer 
        int first= Integer.MAX_VALUE, second=Integer.MAX_VALUE;

        // loop though the array 
        for (int n: nums){
            // while there are 2 elements smaller ...the will keep rewplacing first and second
            if (n<=first){
                first=n;
            }
            //even if first changes after 2nd changed .....we are sure there is a smaller element in the array before 2nd 
            else if (n <= second){
                second=n;
            }
            else {
                //return true as there is a larger element bigger than 1st ans 2nd 
                return true;
            }
        }

        // no such element found 
        return false;
    }
}