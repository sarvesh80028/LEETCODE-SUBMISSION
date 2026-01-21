class Solution {
    public int vowelConsonantScore(String s) {
        int v = 0;
        int c = 0;
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            if(vowel(sb.charAt(i))) v++;
            else if((sb.charAt(i)>=97 && sb.charAt(i)<=122) && vowel(sb.charAt(i))==false) c++;
        }
        if(c>0) return v/c;
        return 0;
    }
    public boolean vowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')return true;
        return false;
    }
    
}