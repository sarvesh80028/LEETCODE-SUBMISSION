class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] nums) {
        List<List<Integer>>list = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        int mindiff = Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(nums[i]-nums[i-1]<mindiff) mindiff = nums[i] - nums[i-1];
        }
        for(int i=0;i<n-1;i++){
            if(Math.abs(nums[i]-nums[i+1])==mindiff){
                list.add(Arrays.asList(nums[i],nums[i+1]));
            }
        }
        return list;
    }
}