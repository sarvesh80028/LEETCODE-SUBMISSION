class Solution {
    public int[] getFinalState(int[] nums, int k, int mul) {
        int n = nums.length;
        for(int i=0;i<k;i++){
            int min = Integer.MAX_VALUE;
            int minidx = -1;
            for(int j=0;j<n;j++){
                if(nums[j]<min){
                    min = nums[j];
                    minidx = j;
                }
            }
            nums[minidx]*=mul;
        }
        return nums;
    }
}