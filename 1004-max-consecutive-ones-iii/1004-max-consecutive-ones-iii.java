class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int max = 0;
        int len = 0;
        int i = 0, j = 0;
        int count = 0;
        while(j<n){
            if(nums[j]==0){
                count++;
            }
            if(count<=k){
                len = j-i+1;
                max = Math.max(len,max);
            }
            j++;
            if(count>k){
                i = i+1;
                j = i;
                count = 0;
            }
        }
        return max;
    }
}