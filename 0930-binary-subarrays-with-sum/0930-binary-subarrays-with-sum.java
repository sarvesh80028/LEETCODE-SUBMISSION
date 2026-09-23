class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        return atMost(nums,goal) - atMost(nums,goal-1);
    }
    private int atMost(int[]nums,int goal){
        if(goal<0) return 0;
        int count = 0, sum = 0;
        int i = 0, j = 0;
        int n = nums.length;
        while(j<n){
            sum+= nums[j];
            while(sum>goal){
                sum-=nums[i];
                i++;
            }
            count+= j-i+1;
            j++;
        }
        return count;
    }
}