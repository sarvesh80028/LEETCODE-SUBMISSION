class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minlen = Integer.MAX_VALUE, sum = 0;
        int i = 0, j = 0;
        while(j<n){
            sum+= nums[j];
            while(sum>=target){
                minlen = Math.min(j-i+1,minlen);
                sum = sum - nums[i];
                i++;
            }
            j++;
        }
        if(minlen == Integer.MAX_VALUE) return 0;
        return minlen;
    }
}