class Solution {
    public int maxPower(String s) {
        HashMap<Character,Integer>map = new HashMap<>();
        int n = s.length();
        int i = 0, j = 0;
        int maxlen = 0;
        while(j<n){
            if(!map.containsKey(s.charAt(j))){
                map.put(s.charAt(j),1);
            }
            else{
                int freq = map.get(s.charAt(j));
                freq++;
                map.put(s.charAt(j),freq);
            }
            while(map.size()>1){
                int freq = map.get(s.charAt(i));
                freq--;
                if(freq==0) map.remove(s.charAt(i));
                else map.put(s.charAt(i),freq);
                i++;
            }
            maxlen = Math.max(maxlen,j-i+1);
            j++;
        }
        return maxlen;
    }
}