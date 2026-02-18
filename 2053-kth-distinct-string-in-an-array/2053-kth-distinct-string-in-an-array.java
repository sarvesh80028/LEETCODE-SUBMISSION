class Solution {
    public String kthDistinct(String[] arr, int k) {
        int count = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int flag = 0;
            for(int j=0;j<n;j++){
                if(i==j) continue;
                if(arr[i].equals(arr[j])){
                    flag = 1;
                    break;
                }
            }
            if(flag==0) count++;
            if(count==k) return arr[i];
        }
        return "";
    }
}