class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i)-'a'+1);
        }
        int sum = 0;
        String x = sb.toString();
        for(int i=0;i<k;i++){
            sum = 0;
            for(int j=0;j<x.length();j++){
                sum+= x.charAt(j) - '0';
            }
            x = String.valueOf(sum);
        }
        return sum;
    }
}