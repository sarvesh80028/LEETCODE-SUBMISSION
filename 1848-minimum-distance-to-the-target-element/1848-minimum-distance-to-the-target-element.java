class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int x = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                int p = Math.abs(i-start);
                if(p<x) x = p;
            }
        }
        return x;
    }
}