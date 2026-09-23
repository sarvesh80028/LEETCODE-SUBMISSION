class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        HashMap<Character,Integer>map = new HashMap<>();
        int i = 0, j = 0;
        int maxfreq = 0, maxlen = 0;
        while(j<n){
            if(!map.containsKey(s.charAt(j))){
                map.put(s.charAt(j),1);
            }
            else{
                int freq = map.get(s.charAt(j));
                freq++;
                map.put(s.charAt(j),freq);
            }
            maxfreq = Math.max(maxfreq,map.get(s.charAt(j)));
           
            while((j-i+1)-maxfreq>k){
                int freq = map.get(s.charAt(i));
                freq--;
                maxfreq = 0;
                map.put(s.charAt(i),freq);
                for(int ele:map.values()){
                    maxfreq = Math.max(maxfreq,ele);
                }
                i++;
            }
            if((j-i+1)-maxfreq<=k){
                maxlen = Math.max(maxlen,j-i+1);
            }
            j++;
        }
        return maxlen;
    }
}