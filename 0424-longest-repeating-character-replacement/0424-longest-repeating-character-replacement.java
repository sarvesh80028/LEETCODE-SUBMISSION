class Solution {
    public int characterReplacement(String s, int k) {
       int n = s.length();
       HashMap<Character,Integer>map = new HashMap<>();
       int maxfreq = 0,maxlen = 0;
       int i = 0, j = 0;
       while(j<n){
        if(!map.containsKey(s.charAt(j))){
            map.put(s.charAt(j),1);
            maxfreq = Math.max(maxfreq,map.get(s.charAt(j)));
        }
        else{
            int freq = map.get(s.charAt(j));
            freq++;
            map.put(s.charAt(j),freq);
            maxfreq = Math.max(maxfreq,map.get(s.charAt(j)));
        }
        // if((j-i+1)-maxfreq<=k){
        //     maxlen = Math.max(maxlen,j-i+1);
        // }
        while((j-i+1)-maxfreq>k){
            int freq = map.get(s.charAt(i));
            freq--;
            maxfreq = 0;
           
            map.put(s.charAt(i),freq);
            
            for(int f : map.values()) {
                maxfreq = Math.max(maxfreq, f);
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