class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        // Collections.sort(nums);
        int count = 0;
        for(int i=0;i<n;i++){
            HashMap<Integer,Integer>map = new HashMap<>();
            for(int j=i;j<n;j++){
                if(!map.containsKey(nums.get(j))) map.put(nums.get(j),1);
                else{
                    int freq = map.get(nums.get(j));
                    freq++;
                    map.put(nums.get(j),freq);
                }
                count+= map.size()*map.size();
            }
            
        }
        return count;
    }
}