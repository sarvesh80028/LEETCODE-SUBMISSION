class Solution {
    public String countAndSay(int n) {
        return ans(1,n,"1");
    }
    private String ans(int k,int n,String s){
        if(k==n) return s;
        int i = 0, j = 0;
        StringBuilder sb = new StringBuilder();
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j))
            j++;
            else{
                sb.append(j-i);
                sb.append(s.charAt(i));
                i = j;
            }
        }
        sb.append(j-i);
        sb.append(s.charAt(i));
        return ans(k+1,n,sb.toString());
    }
}