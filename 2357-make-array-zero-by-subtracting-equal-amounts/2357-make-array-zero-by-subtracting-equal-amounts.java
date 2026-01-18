class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int count = 0;
        for(int i=0;i<n;i++){
            int x = nums[i];
            if(x==0) continue;
            for(int j=0;j<n;j++){
                nums[j] = nums[j] - x;
            }
            count++;
            if(nums[n-1]==0) break;
        }
        return count;
    }
}