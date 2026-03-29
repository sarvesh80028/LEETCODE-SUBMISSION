class Solution {
    public boolean canBeEqual(String s1, String s2) {
        int n = s1.length();
        if(s1.equals(s2)) return true;
        StringBuilder sb = new StringBuilder(s1);
        for(int k=0;k<n;k++){
            if(s1.charAt(k)!=s2.charAt(k)){
                int i = k;
                int j = i+2;
        while(j<n){
            char ci = sb.charAt(i);
            char cj = sb.charAt(j);
            sb.setCharAt(i,cj);
            sb.setCharAt(j,ci);
            i++;
            j++;
            String x = sb.toString();
            if(s2.equals(x)) return true;
        }
        }
        } 
        return false;
    }
}