class Solution {
    public int maximumNumberOfStringPairs(String[] s) {
        int n = s.length;
        int count = 0;
        for(int i=0;i<n;i++){
            StringBuilder sb = new StringBuilder(s[i]);
            reverse(sb);
            String x = sb.toString();
            for(int j=i+1;j<n;j++){
                if(x.equals(s[j])) count++;
            }
        }
        return count;
    }
    public void reverse(StringBuilder sb){
        int i = 0;
        int j = sb.length()-1;
        while(i<j){
            char ci = sb.charAt(i);
            char cj = sb.charAt(j);
            sb.setCharAt(i,cj);
            sb.setCharAt(j,ci);
            i++;
            j--;
        }
    }
}