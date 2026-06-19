class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int n = nums.length;
        int[]arr = new int[2];
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(int i=1;i<=n;i++){
            if(map.containsKey(i)&&map.get(i)>1) arr[0]=i;
            else if(!map.containsKey(i)&&map.get(i)==null) arr[1] = i;
            
        }
        return arr;
    }
}