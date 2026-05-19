class Solution {
    public int getCommon(int[] num1, int[] num2) {
        int x = -1;
        int m = num1.length;
        int n = num2.length;
        int i = 0, j = 0;
        while(i<m && j<n){
            if(num1[i]==num2[j]){
                x = num1[i];
                break;
            }
            else if(num1[i]>num2[j]) j++;
            else i++;
        }
        return x;
    }
}