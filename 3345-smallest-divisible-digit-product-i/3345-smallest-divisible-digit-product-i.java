class Solution {
    public int smallestNumber(int n, int t) {
        int original = n;
        while(true){
            int mul = 1;
            int x = original;
        while(original>0){
            int digit = original%10;
            mul*=digit;
            original = original/10;
            }
            if(mul%t==0){
                return x;
            }
           original = x + 1;
        }

    }
}