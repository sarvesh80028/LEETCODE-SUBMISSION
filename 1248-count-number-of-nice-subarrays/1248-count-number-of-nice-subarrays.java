class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                nums[i] = 0;
            }
            else{
                nums[i] = 1;
            }
        }
        return atMost(nums,k) - atMost(nums,k-1);
    }
    private int atMost(int[]nums,int k){
        int n = nums.length;
        int count = 0, sum = 0;
        int i = 0, j = 0;
        while(j<n){
            sum+=nums[j];
            while(sum>k){
                sum-= nums[i];
                i++;
            }
            count+= j-i+1;
            j++;
        }
        return count;
    }
}