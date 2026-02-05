class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        int x = 0;
        int y = 0;
        if(nums[0]>nums[1]) return false;
        if(n==3) return false;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]) return false;
        }
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                x = i+1;
                break;
            }
        }
        for(int i=x;i<n-1;i++){
            if(nums[i]<nums[i+1]){
                y = i+1;
                break;
            }
        }
        if(y==0 || x==0) return false;
        for(int i=0;i<x-1;i++){
            if(nums[i]>nums[i+1]) return false;
        }
        for(int i=x;i<y-1;i++){
            if(nums[i]<nums[i+1]) return false;
        }
        for(int i=y;i<n-1;i++){
            if(nums[i]>nums[i+1]) return false;
        }
        return true;
    }
}