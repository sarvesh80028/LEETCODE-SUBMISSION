class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>result = new ArrayList<>();
        List<Integer>current = new ArrayList<>();
        allSubset(0,nums,current,result);
        return result;
    }
    private void allSubset(int i, int[]nums, List<Integer>current,List<List<Integer>>result){
        if(i>=nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[i]);
        allSubset(i+1,nums,current,result);
        current.remove(current.size()-1);
        allSubset(i+1,nums,current,result);
    }
}