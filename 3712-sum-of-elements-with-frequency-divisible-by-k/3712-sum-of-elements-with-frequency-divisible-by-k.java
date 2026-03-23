class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int sum = 0;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int count = 0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]) count++;
            }
            if(count%k==0){
                sum+=count*nums[i];
            }
        }
        return sum;
    }
}