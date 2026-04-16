class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int n = Math.min(s1.length(),Math.min(s2.length(),s3.length()));
        int i = 0;
        while(i<n){
            char ci = s1.charAt(i);
            char c2 = s2.charAt(i);
            char c3 = s3.charAt(i);
            if(ci==c2 && c2==c3) i++;
            else{
                break;
            }
        }
        if(i==0) return -1;
        int x = s1.length()-i+s2.length()-i+s3.length()-i;
        return x;
    }
}