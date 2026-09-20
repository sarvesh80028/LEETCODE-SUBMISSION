class Solution {
    public int sumOfUnique(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        int sum = 0;
        int n = nums.length;
        int[]freq = new int[101];
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }
        for(int i=0;i<nums.length;i++){
            if(freq[nums[i]]==1)sum+=nums[i];
        }
        return sum;
    }
}