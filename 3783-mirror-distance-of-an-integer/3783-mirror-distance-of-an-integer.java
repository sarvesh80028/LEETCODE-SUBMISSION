class Solution {
    public int mirrorDistance(int n) {
       StringBuilder sb = new StringBuilder();
       sb.append(n);
       String p = sb.reverse().toString();
       String q = String.valueOf(n);
       int x = Integer.parseInt(p);
       int y = Integer.parseInt(q);
       return Math.abs(x-y);
    }
}