class Solution {
    public int sumOfUnique(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length,sum = 0;
        if(n==1) return nums[0];
        int i = 0;
        for(i=1;i<n-1;i++){
            if(nums[i]!=nums[i+1] && nums[i]!=nums[i-1]) sum+=nums[i];
        }
        if(nums[0]!=nums[1]) sum+=nums[0];
        if(i<n && nums[n-2]!=nums[n-1]) sum+=nums[n-1];
        return sum;
    }
}