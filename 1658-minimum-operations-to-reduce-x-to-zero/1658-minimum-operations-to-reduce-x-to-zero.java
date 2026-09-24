class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int totalsum = 0;
        for(int i=0;i<n;i++){
            totalsum+= nums[i];
        }
        int i = 0, j = 0;
        int sum = 0, maxlen = 0;

        if(x>totalsum) return -1;
        if(x==totalsum) return n;
        while(j<n){
            sum+= nums[j];
            while(sum>(totalsum-x)){
                sum = sum - nums[i];
                i++;
            }
            if(sum==(totalsum-x)){
            maxlen = Math.max(maxlen,j-i+1);
            }
            j++;
        }
        if(maxlen==0) return -1;
        return (n-maxlen);
    }
}