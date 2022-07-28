class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int l=0, h=nums.length-1;
        List<List<Integer>> ll= new ArrayList<>();
        
        for (int i=0;i< nums.length; i++){
            
            if (i>0 && nums[i-1] == nums[i]){
                continue;
            }
            else if (nums[i]<=0){
                l=i+1;
                h=nums.length-1;
                while (l<h){
                    int sum =nums[l]+nums[h]+nums[i];
                    if (sum == 0){
                        List<Integer> li = new ArrayList<>();
                        li.add(nums[i]);
                        li.add(nums[l++]);
                        li.add(nums[h--]);
                        ll.add(li);
                        // System.out.println("a");
                        while ( l<h && nums[l] == nums[l-1]){
                            l++;
                        }
                    }
                    else if (sum > 0){
                            h--;
                    }
                    else{
                            l++;
                    }
                }
            }
            else {
                break;
            }
        }
        return ll;
        
    }
}