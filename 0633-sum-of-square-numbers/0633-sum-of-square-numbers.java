class Solution {
    public boolean judgeSquareSum(int c) {
        long sum = 0;
        long i = 0;
        long j = (long)Math.sqrt(c);
        while(i<=j){
            sum = i*i + j*j;
            if(sum==c) return true;
            else if(sum<c) i++;
            else j--;
        }
        return false;
    }
}