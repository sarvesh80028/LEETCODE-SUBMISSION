class Solution {
    public boolean repeatedSubstringPattern(String s) {
       StringBuilder sb = new StringBuilder(s+s);
       int n = sb.length();
       sb.deleteCharAt(0);
       sb.deleteCharAt(n-2);
       if((sb.toString()).contains(s)) return true;
       return false;
    }
}