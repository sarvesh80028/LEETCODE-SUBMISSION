class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int max = Integer.MIN_VALUE;
        int pd = 1;
        for(int i=0;i<n;i++){
            pd*=nums[i];
            
            max = Math.max(max,pd);
            if(pd==0) pd = 1;
        }
        pd = 1;
         for(int i=n-1;i>=0;i--){
            pd*=nums[i];
            
            max = Math.max(max,pd);
            if(pd==0) pd = 1;
        }
        return max;
    }
}