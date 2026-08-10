class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n =arr.length;
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                int[]ar = new int[2];
                ar[0]=i;
                ar[1]=j;
                return ar;
                }
            }
        }
        return new int[]{};
    }
    }