class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int i = 0, j = 0;
        int maxlen = 0;
        while(j<n){
            if(nums[j]==1){
                maxlen = Math.max(maxlen,j-i+1);
            }
            else{
                i = j+1;
            }
            j++;
        }
        return maxlen;
    }
}