class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        HashSet<List<Integer>>result = new HashSet<>();
        List<Integer>current = new ArrayList<>();
        boolean[]used = new boolean[nums.length];
        Arrays.sort(nums);
        ans(nums,used,current,result);
        return new ArrayList<>(result);
    }
    private void ans(int[]nums,boolean[]used,List<Integer>current,HashSet<List<Integer>>result){
        if(current.size()==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<nums.length;i++){
            
            if(!used[i]){
                current.add(nums[i]);
                used[i] = true;
                ans(nums,used,current,result);
                used[i] = false;
                current.remove(current.size()-1);
            }
        }
    }
}