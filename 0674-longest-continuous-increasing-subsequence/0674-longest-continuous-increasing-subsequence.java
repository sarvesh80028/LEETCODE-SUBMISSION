class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        if(n==1) return 1;
        int len = 1, maxlen = 0;
        for(int i=0;i<n-1;i++){
            if(nums[i]<nums[i+1]){
                len++;
            }
            else{
                len = 1;
            }
            maxlen = Math.max(len,maxlen);
        }
        return maxlen;
    }
}