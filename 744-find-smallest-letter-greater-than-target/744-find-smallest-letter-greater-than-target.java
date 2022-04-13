class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low=0, high=letters.length-1, mid=0;
        while (low<=high){
            mid=low+(high-low)/2;
            
            if (letters[mid]> target && (mid==0 || letters[mid-1]<=target) ){
                break;
            }
            else if (letters[mid] > target){
                high=mid-1;
                }
            else
                low=mid+1;
            
        }
        return (letters[mid]<=target)?letters[0]:letters[mid];
    }
}