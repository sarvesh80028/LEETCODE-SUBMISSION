class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int n = nums.length;
        int count = 0;
        for(int i=0;i<n;i++){
            int x = nums[i];
            while(x>0){
                int p = x%10;
                if(p==digit) count++;
                x = x/10;
            }
        }
        return count;
    }
}