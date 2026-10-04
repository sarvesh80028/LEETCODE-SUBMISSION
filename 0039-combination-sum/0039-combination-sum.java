class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer>current = new ArrayList<>();
        List<List<Integer>>result = new ArrayList<>();
        ans(0,target,candidates,current,result);
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
        // if(current.size()>0) current.remove(current.size()-1);
        
        ans(i+1,target,nums,current,result);
    }
}