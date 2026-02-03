class Solution {
    public boolean validPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sc = new StringBuilder(s);
        int i = 0,a=0,x=0;
        int j = sb.length()-1;
        while(i<j){
            if(sb.charAt(i)!=sb.charAt(j)){
                a=1;
                sb.deleteCharAt(i);
              x = palindrome(sb);
              break;
            }
            i++;
            j--;
        }
        if(a==0) return true;
        if(x==1) return true;
        if(x==0){
        sc.deleteCharAt(j);
       x = palindrome(sc);
        }
        if(x==1) return true;
        return false;
    }
    public int palindrome(StringBuilder sb){
        int flag = 0;
        int i =0;
        int j =sb.length()-1;
        while(i<j){
            if(sb.charAt(i)!=sb.charAt(j)) flag = 1;
            i++;
            j--;
        }
        if(flag == 0) return 1;
        return 0;
    }
}