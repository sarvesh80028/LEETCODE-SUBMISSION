class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxlen1 = 1, len = 1;
        int n = nums.length;
        int i = 0;
        while(i<n-1){
            if(nums[i]<nums[i+1]){
                len++;
                maxlen1 = Math.max(maxlen1,len);
            }
            else{
                len = 1;
            }
            i++;
        }
        int j = 0,maxlen2 = 1;
        len = 1;
        while(j<n-1){
            if(nums[j]>nums[j+1]){
                len++;
                maxlen2 = Math.max(maxlen2,len);
            }
            else{
                len = 1;
            }
            j++;
        }
        return Math.max(maxlen1,maxlen2);
    }
}