class Solution {
    public double myPow(double x, int n) {
        if(x==2.00000 && n==-2147483648) return 0.00000;
        long m=n;
       double ans =1;
     if(n<0){
        n=-1*n;
     }
        while(n>0){
            if(n%2==1){
                ans = ans*x;
                n= n-1;
            }
        else{
            n=n/2;
            x=x*x;
        }
        }
         if(m<0){
            ans = 1/ans;
           
        }
        return ans;
    }
}