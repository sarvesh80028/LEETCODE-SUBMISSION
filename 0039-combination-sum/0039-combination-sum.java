class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>>result = new ArrayList<>();
        List<Integer>current = new ArrayList<>();
        ans(0,target,nums,current,result);
        return result;
    }
    private void ans(int i,int target,int[]nums,List<Integer>current,List<List<Integer>>result){
        if(i>=nums.length){
            if(target==0){
                result.add(new ArrayList<>(current));
            }
            return;
        }
        if(nums[i]<=target){
            current.add(nums[i]);
            ans(i,target-nums[i],nums,current,result);
            current.remove(current.size()-1);
        }
        ans(i+1,target,nums,current,result);
    }
}