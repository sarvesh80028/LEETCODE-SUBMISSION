class Solution {
    public int lengthOfLongestSubstring(String s) {
      int n = s.length();
      int i = 0, j = 0, max = 0;
      HashSet<Character> map = new HashSet<>();
      while(j<n){
        char ele = s.charAt(j);
        if(map.contains(ele)){
            if(j-i>max) max = j-i;
             map.remove(s.charAt(i));
             i++;
            
        }
        else{
            j++;
            map.add(ele);
        }
      }
      if(j-i>max) max = j-i;
      return max;
    }
}