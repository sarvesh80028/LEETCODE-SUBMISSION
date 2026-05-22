class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
      int k = rotation(nums);
     int x = binarysearch(0,k,target,nums);
     if(x!=-1) return x;
     int y = binarysearch(k,n,target,nums);
     return y;
    }
    public int rotation (int[]nums){
        int n = nums.length;
        int lo = 0,hi = n-1;
        if(nums[lo]<=nums[hi]) return 0;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(mid>0 && nums[mid]<nums[mid-1]) return mid;
            else if(nums[mid]>nums[hi]) lo = mid+1;
            else hi = mid-1;
        }
        return 0;
    }
    public int binarysearch(int x,int y,int target,int[]nums){
            int lo = x;
            int hi = y-1;
            int flag = 0;
            while(lo<=hi){
                int mid = (lo+hi)/2;
                if(nums[mid]==target){
                    flag = 1;
                    return mid;
                }
                else if(nums[mid]>target) hi = mid-1;
                else lo = mid+1;
            }
           return -1; 
    }
}