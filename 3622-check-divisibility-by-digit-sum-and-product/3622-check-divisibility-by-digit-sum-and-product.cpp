class Solution {
public:
    bool checkDivisibility(int n) {
        int sum = 0;
        int mul = 1;
        int original = n;
        while(original>0){
            int digit = original%10;
            sum+=digit;
            mul*=digit;
            original = original/10;
        }
        int x = sum + mul;
        if(n%x==0) return true;
        return false;
    }
};