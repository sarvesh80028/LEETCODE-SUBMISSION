class Solution {
    public int distributeCandies(int[] nums) {
        int count = 0;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            else count++;
        }
        if(count<=n/2) return count;
        return n/2;
    }
}