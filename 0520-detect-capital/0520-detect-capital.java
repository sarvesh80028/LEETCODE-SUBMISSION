class Solution {
    public boolean detectCapitalUse(String str) {
        if(str.equals(str.toUpperCase())) return true;
        if(str.equals(str.toLowerCase())) return true;
        char ch = str.charAt(0);
        if(Character.isUpperCase(ch)){
            for(int i=1;i<str.length();i++){
                if(Character.isUpperCase(str.charAt(i))) return false;
            }
            return true;
        }
        else{
            for(int i=1;i<str.length();i++){
                if(Character.isUpperCase(str.charAt(i))) return false;
            }
        }
        return true;
    }
}