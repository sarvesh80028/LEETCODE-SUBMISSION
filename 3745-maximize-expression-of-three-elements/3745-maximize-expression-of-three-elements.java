class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int x = nums[n-1] + nums[n-2] - nums[0];
        return x;
    }
}