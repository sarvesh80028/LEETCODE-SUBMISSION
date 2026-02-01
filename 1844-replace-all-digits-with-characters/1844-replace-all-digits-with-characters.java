class Solution {
    public String replaceDigits(String s) {
       StringBuilder sb = new StringBuilder(s);
       for(int i=0;i<sb.length();i++){
        if(Character.isDigit(sb.charAt(i))){
            char c = (char)(s.charAt(i)-'0' + s.charAt(i-1));
            sb.setCharAt(i,c);
        }
       }
       return sb.toString();
    }
}