class Solution {
    public int maxConsecutiveAnswers(String s, int k) {
        int n = s.length();
        int i = 0, j = 0;
        int maxlent = 0, maxlenf = 0;
        int count = 0;
        while(j<n){
            if(s.charAt(j)=='F') count++;
            while(count>k){
                if(s.charAt(i)=='F') count--;
                i++;
            }
            maxlent = Math.max(maxlent,j-i+1);
            j++;
        }

        i = 0; j = 0;
        count = 0;
         while(j<n){
            if(s.charAt(j)=='T') count++;
            while(count>k){
                if(s.charAt(i)=='T') count--;
                i++;
            }
            maxlenf = Math.max(maxlenf,j-i+1);
            j++;
        }
        return Math.max(maxlent,maxlenf);
    }
}