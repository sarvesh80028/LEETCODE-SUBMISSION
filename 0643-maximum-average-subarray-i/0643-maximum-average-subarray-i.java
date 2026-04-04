class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        if(nums.length==1) return nums[0];
        double avg = -1e9;
        int i = 0,j = 0;
        double sum = 0;
         while(j<n){
            sum+=nums[j];
            if((j-i)+1==k){
                double x = sum/k;
                if(x>avg) avg = x;
                sum-=nums[i];
                i++;
            }
            j++;
         }
        return avg;
    }
}