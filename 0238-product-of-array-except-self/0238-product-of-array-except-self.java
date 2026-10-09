class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[]pre = new int[n];
        int lp = 1;
        pre[0] = nums[0];
        for(int i=1;i<n;i++){
            lp*=nums[i-1];
            pre[i] = lp;
        }
        int[]suff = new int[n];
        int rp = 1;
        suff[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            rp*=nums[i+1];
            suff[i] = rp;
        }
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            if(i==0) arr[i] = 1*suff[i];
            else if(i==n-1) arr[i] = pre[i] * 1;
            else arr[i] = pre[i] * suff[i];
        }
        return arr;
    }
}