class Solution {
    public char nextGreatestLetter(char[]s, char target) {
        int n = s.length;
        for(int i=0;i<n;i++){
            if(s[i]>target) return s[i];
        }
        return s[0];
    }
}