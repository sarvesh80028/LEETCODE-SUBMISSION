class Solution {
    public String reverseByType(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        int n = sb.length();
        int j = n-1;
        while(i<j){
            char ci = sb.charAt(i);
            char cj = sb.charAt(j);
            if(Character.isLetter(ci) && Character.isLetter(cj)){
                sb.setCharAt(i,cj);
                sb.setCharAt(j,ci);
                i++;
                j--;
            }
            else if(Character.isLetter(ci)){
                j--;
            }
            else{
                i++;
            }
        }
        i = 0;
        j = n-1;
        while(i<j){
            char ci = sb.charAt(i);
            char cj = sb.charAt(j);
            if(!Character.isLetter(ci) && !Character.isLetter(cj)){
                sb.setCharAt(i,cj);
                sb.setCharAt(j,ci);
                i++;
                j--;
            }
            else if(!Character.isLetter(ci)){
                j--;
            }
            else{
                i++;
            }
        }
        return sb.toString();
    }
}