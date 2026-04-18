class Solution {
    public int mirrorDistance(int n) {
        int x = n;
        int rev = 0;
        while(x>0){
            int digit = x%10;
            rev = rev*10+digit;
            x = x/10;
        }
        return Math.abs(rev-n);
    }
}