class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = -1;
        List<Integer> l = new LinkedList<>();
        for (int i: nums){
            hm.put(i, hm.getOrDefault(i,0)+1);
            if (hm.get(i)>max){
                l= new LinkedList<>();
                max= hm.get(i);
            }
            if (hm.get(i)==max){
                l.add(i);
            }
        }

        int size=Integer.MAX_VALUE;

        for (int i: l){
            int front=0, back = nums.length-1;
            while (nums[front]!= i){
                front++;
            }
            while (nums[back]!= i){
                back--;
            }
            size= Math.min(size, back-front+1);
        }

        return size;

    }
}