class Solution {
    public int reverseDegree(String s) {
        int n = s.length();
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+= (123-s.charAt(i))*(i+1);
        }
        return sum;
    }
}