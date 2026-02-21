class Solution {
    public boolean checkZeroOnes(String s) {
        int n = s.length();
        
        int len1 = 0, len0 = 0;
        int max1 = 0, max0 = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                len1 = 0;
                len0++;
                if(len0>max0) max0 = len0;
            }
            else{
                len1++;
                if(len1>max1) max1 = len1;
                len0 = 0;
            }
        }
        if(max1>max0) return true;
        return false;
    }
}