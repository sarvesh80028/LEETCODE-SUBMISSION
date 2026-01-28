class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int pd1 = nums[0]*nums[1];
        int pd2 = nums[n-1]*nums[n-2];
        int max = Math.abs(pd1-pd2);
        return max;
    }
}