class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums,k) - atMost(nums,k-1);
    }
    private int atMost(int[]nums,int k){
        HashMap<Integer,Integer>map = new HashMap<>();
        int n = nums.length;
        int count = 0;
        int i = 0, j = 0;
        while(j<n){
            if(!map.containsKey(nums[j])){
                map.put(nums[j],1);
            }
            else{
                int freq = map.get(nums[j]);
                freq++;
                map.put(nums[j],freq);
            }
            while(map.size()>k){
                int freq = map.get(nums[i]);
                freq--;
                if(freq==0) map.remove(nums[i]);
                else map.put(nums[i],freq);
                i++;
            }
            count+= j-i+1;
            j++;
        }
        return count;
    }
}