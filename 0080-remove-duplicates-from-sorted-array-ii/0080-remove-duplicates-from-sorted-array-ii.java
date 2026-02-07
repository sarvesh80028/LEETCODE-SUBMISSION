class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 0;
        for(int i=0;i<n;i++){
            if(i>1 && nums[i]==nums[k-2]) continue;
            nums[k++] = nums[i];
        }
        return k;
    }
}