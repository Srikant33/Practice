class Solution {
    public int sumFourDivisors(int[] nums) {
        int total=0;

        for (int num:nums){
            total+=helper(num);
        }

        return total;
    }

    public int helper (int n){
        int sum=n+1;
        int count=2;

        for(int i=2; i<=n/2; i++){
            if (n%i==0){
                sum+=i;
                count++;
            }
            if (count>4){
                return 0;
            }
        }

        return count==4?sum:0;
    }
}

