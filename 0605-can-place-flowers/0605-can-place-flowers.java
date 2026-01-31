class Solution {
    public boolean canPlaceFlowers(int[] nums, int n) {
        int count = 0;
        int m = nums.length;
        if(m==1 && nums[0]==0){
            nums[0] = 1;
            count++;
            return count>=n;
        }
        if(nums[0]==0 && nums[1]==0){
            nums[0] = 1;
            count++;
        }
        if(m>=2 && nums[m-1]==0 && nums[m-2]==0){
            nums[m-1] = 1;
            count++;
        }
        for(int i=1;i<m-1;i++){
            if(nums[i]==0 && nums[i-1]==0 && nums[i+1]==0){
                nums[i] = 1;
                count++;
            }
        }
        if(count>=n) return true;
        return false;
    }
}