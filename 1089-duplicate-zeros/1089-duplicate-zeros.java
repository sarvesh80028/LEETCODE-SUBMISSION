class Solution {
    public void duplicateZeros(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                for(int j=n-1;j>i;j--){
                    nums[j] = nums[j-1];
                }
                i++;
            }
        }
    }
}