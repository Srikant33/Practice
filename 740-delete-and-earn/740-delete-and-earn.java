class Solution {
    public int deleteAndEarn(int[] nums) {
        if (nums.length==1){
            return nums[0];
        }
        HashMap <Integer, Integer> hm= new HashMap<>();
        for (int n: nums){
            if (hm.containsKey(n)){
                hm.put (n, hm.get(n)+n);
            }
            else{
                hm.put(n, n);
            }
        }
        
        int[] u= new int[hm.size()];
        int[] val= new int[hm.size()];
        int j=0;
        for (int key: hm.keySet()){
            u[j]= key;
            j++;
        }

        Arrays.sort(u);
        for (int i=0;i<u.length; i++){
            if (i>1 && u[i]!=u[i-1]+1)
                val[i]=Math.max(val[i-1],val[i-2]) +hm.get(u[i]);
            else if (i>1 && u[i]==u[i-1]+1){
                val[i]=Math.max(val[i-2]+hm.get(u[i]), val[i-1]);
            } else if (i==1 && u[i]==u[i-1]+1 ){
                val[i]= Math.max(val[i-1], hm.get(u[i]));
            }
            else if (i==1 && u[i]!=u[i-1]+1 ){
                val[i]= val[i-1]+hm.get(u[i]);
            }
            else
                val[i]=hm.get(u[i]);
            
            System.out.println(val[i]);
        }
        return Math.max(val[val.length-1],val[val.length-2]);
    }
}