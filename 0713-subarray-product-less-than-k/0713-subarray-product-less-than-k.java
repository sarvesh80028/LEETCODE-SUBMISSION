class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int pd = 1,count = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            pd = 1;
            pd*=nums[i];
            if(pd<k) count++;
            else continue;
            for(int j=i+1;j<n;j++){
                pd*=nums[j];
                if(pd<k) count++;
                else if(pd>=k) break;;
            }
        }
        return count;
    }
}