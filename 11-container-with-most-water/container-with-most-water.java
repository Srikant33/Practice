class Solution {
    public int maxArea(int[] height) {
        // 2 pointer /...move the smaller pointer
        int front=0, back =height.length-1;
        int max =0;
        // traverse 
        while (front<back){
            max=Math.max(max, Math.min(height[front], height[back])* (back-front));

            // move the smallest point 
            if (height[front]<height[back]){
                front++;
            }
            else {
                back--;
            }
        } 

        //return max;
        return max;
    }
}