class Solution {
    public String greatestLetter(String s) {
        char ch = 'A';
        int n = s.length();
        int flag = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((int)s.charAt(i)==(int)s.charAt(j)+32||(int)s.charAt(i)==(int)s.charAt(j)-32){
                    if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                        char x = (char)(s.charAt(i) - 32);
                        if(x>ch) ch = x;
                        flag = 1;
                    }
                    else{
                        if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                            char x = s.charAt(i);
                            if(x>ch) ch = x;
                            flag = 1;
                        }
                    }
                }
            }
        }
        if(flag==0) return "";
        return String.valueOf(ch);
    }
}