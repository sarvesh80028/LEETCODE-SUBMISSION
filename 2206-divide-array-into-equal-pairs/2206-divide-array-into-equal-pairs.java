class Solution {
    public boolean divideArray(int[] nums) {
        int n = nums.length;
        int count = 0;
        Arrays.sort(nums);
        int i = 0;
        int j = 0;
        while(j<n){
            if(nums[i]==nums[j]){
                j++;
                count++;
            }
            else{
                if(count%2!=0) return false;
                i = j;
                count = 0;
            }
        }
        if(count%2!=0) return false;
        return true;
    }
}