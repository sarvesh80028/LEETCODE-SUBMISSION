class Solution {
    public boolean isSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();
        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();
        while(i<m && j<n){
            if(s.charAt(i)==t.charAt(j)){
                sb.append(t.charAt(j));
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        String x = sb.toString();
        if(s.equals(x)) return true;
        return false;
    }
}