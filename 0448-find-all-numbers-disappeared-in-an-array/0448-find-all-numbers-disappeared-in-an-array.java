class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])) map.put(nums[i],1);
            else{
                int freq = map.get(nums[i]);
                freq++;
                map.put(nums[i],freq);
            }
        }
            ArrayList<Integer>arr = new ArrayList<>();
            for(int i=1;i<=n;i++){
                if(!map.containsKey(i)){
                    arr.add(i);
                }
            }
        
        return arr;
    }
}