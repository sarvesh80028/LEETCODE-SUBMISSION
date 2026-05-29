class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            int x = nums[i];
            int sum = 0;
            while(x>0){
                int digit = x%10;
                sum+=digit;
                x = x/10;
            }
            nums[i] = sum;
        }
        Arrays.sort(nums);
        return nums[0];
    }
}