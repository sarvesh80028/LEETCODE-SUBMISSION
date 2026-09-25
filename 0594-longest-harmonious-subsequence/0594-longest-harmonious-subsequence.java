class Solution {
    public int findLHS(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int i = 0, j = 0;
        int maxlen = 0, max = 0;
        int len = 0, min = Integer.MAX_VALUE;
        HashMap<Integer,Integer>map = new HashMap<>();
        while(j<n){
            if(!map.containsKey(nums[j])){
                 map.put(nums[j],1);
                 max = Math.max(max,nums[j]);
                 min = Math.min(min,nums[j]);
                 
            }
            else{
                int freq = map.get(nums[j]);
                freq++;
                map.put(nums[j],freq);
            }
            while(map.size()>2){
                int freq = map.get(nums[i]);
                freq--;
                if(freq==0){
                    map.remove(nums[i]);
                    max = Integer.MIN_VALUE;
                    min = Integer.MAX_VALUE;
                    for(int ele:map.keySet()){
                        max = Math.max(max,ele);
                        min = Math.min(min,ele);
                    }
                }
                else map.put(nums[i],freq);
                i++;
            }
            if(max-min==1){
                maxlen = Math.max(maxlen,j-i+1);
                 }
            j++;
        }
        return maxlen;
    }
}