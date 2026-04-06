class Solution {
    public int arrangeCoins(int n) {
        int x = n;
        int count = 0;
        for(int i=1;i<=x;i++){
            if(n>=i){
                n = n-i;
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}