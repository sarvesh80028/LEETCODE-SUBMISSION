class Solution {
    public String defangIPaddr(String s) {
       StringBuilder sb = new StringBuilder();
       int n = s.length();
       for(int i=0;i<n;i++){
        if(s.charAt(i)=='.'){
            sb.append("[.]");
        }
        else{
            sb.append(s.charAt(i));
        }
       }
       return sb.toString();
    }
}