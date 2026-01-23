class Solution {
    public int countEven(int num) {
        int count = 0;
        for(int i=1;i<=num;i++){
            int digitsum = 0;
            if(i<10 && i%2==0) count++;
            else{
                int x = i;
                while(x>0){
                    int digit = x%10;
                    digitsum+= digit;
                    x = x/10;
                }
                if(digitsum%2==0) count++;
            }
        }
        return count;
    }
}