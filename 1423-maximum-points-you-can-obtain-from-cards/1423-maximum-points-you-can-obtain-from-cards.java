class Solution {
    public int maxScore(int[] nums, int k) {
        int n = nums.length;
        int maxsum = 0,lsum = 0, rsum = 0;
        for(int i=0;i<k;i++){
            lsum+=nums[i];
        }
        maxsum = lsum;
        int r = n-1;
        for(int i=k-1;i>=0;i--){
            lsum = lsum - nums[i];
            rsum+= nums[r];
            r--;
            maxsum = Math.max(maxsum,lsum+rsum);
        }
        return maxsum;
    }
}