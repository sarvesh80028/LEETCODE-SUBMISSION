class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int pd1 = nums[0]*nums[1];
        int pd2 = nums[n-1]*nums[n-2];
        int max = (pd2-pd1);
        return max;
    }
}