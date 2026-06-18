class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer>arr = new ArrayList<>();
        int n = nums.length;
        HashSet<Integer>set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int i=nums[0];i<=nums[n-1];i++){
            if(set.contains(i)) continue;
            arr.add(i);
        }
        return arr;
    }
}