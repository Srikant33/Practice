class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int front=0,back=height.length-1, small;
        while (front!=back){
            if (height[front]<height[back]){
                small=height[front];
                if (max<(back-front)*small){
                    max=(back-front)*small;
                }
                front++;
            }
            else{
                small=height[back];
                if (max<(back-front)*small){
                    max=(back-front)*small;
                }
                back--;
            }
            
        }
        return max;  
    }
}