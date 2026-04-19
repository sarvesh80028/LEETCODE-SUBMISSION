class Solution {
    public int maxDistance(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(nums[i]!=nums[j]){
                    int x = Math.abs(j - i);
                    if(x>max) max = x;
                }
            }
        }
        if(max == Integer.MIN_VALUE) return 0;
        return max;
    }
}