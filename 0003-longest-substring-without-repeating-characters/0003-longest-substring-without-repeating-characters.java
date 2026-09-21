class Solution {
    public int lengthOfLongestSubstring(String s) {
       int n = s.length();
       int i = 0, j = 0;
       int maxlen = 0;
       HashMap<Character,Integer>map = new HashMap<>();
       while(j<n){
        if(!map.containsKey(s.charAt(j))){
            map.put(s.charAt(j),1);
            maxlen = Math.max(maxlen,j-i+1);
        }
        else{
            int freq = map.get(s.charAt(j));
            freq++;
            map.put(s.charAt(j),freq);
            while(map.get(s.charAt(j))>1 && i<n){
                int x = map.get(s.charAt(i));
                x--;
                if(x>0){
                   
                map.put(s.charAt(i),x);
                }
                else if(x==0){
                map.remove(s.charAt(i));
                }
                i++;
            }
        }
        j++;
       }
       return maxlen;
    }
}