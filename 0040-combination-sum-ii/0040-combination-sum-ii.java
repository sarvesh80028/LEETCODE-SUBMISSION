class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>>result = new ArrayList<>();
        List<Integer>current = new ArrayList<>();
        Arrays.sort(nums);
        ans(0,target,nums,current,result);
        return result;
    }
    private void ans(int i,int target,int[]nums,List<Integer>current,List<List<Integer>>result){
        if(target==0){
            result.add(new ArrayList<>(current));
            return;
        }
        
        for(int j=i;j<nums.length;j++){
            if(nums[j]>target) break;
            if(j>i && nums[j]==nums[j-1]) continue;
            
                current.add(nums[j]);
                ans(j+1,target-nums[j],nums,current,result);
            
            current.remove(current.size()-1);
        }
        
    }
}