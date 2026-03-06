class Solution {
    public int findLucky(int[] arr) {
        int max = -1;
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n;i++){
            count = 0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]) count++;
            }
            if(count==arr[i] && arr[i]>max) max = arr[i];
        }
        return max;
    }
}