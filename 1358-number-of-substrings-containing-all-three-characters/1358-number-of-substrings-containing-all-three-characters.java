class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        HashMap<Character,Integer>map = new HashMap<>();
        int i = 0, j = 0;
        int count = 0;
        while(j<n){
            if(!map.containsKey(s.charAt(j))){
                map.put(s.charAt(j),1);
            }
            else{
                int freq = map.get(s.charAt(j));
                freq++;
                map.put(s.charAt(j),freq);
            }
            while(map.size()==3){
                
                count+= (n - j);
                int freq = map.get(s.charAt(i));
                freq--;
                if(freq==0){
                    map.remove(s.charAt(i));
                }
                else{
                    map.put(s.charAt(i),freq);
                }
                i++;
            }
            if(i<j && j==n-1 && map.size()==3){
                j = n-2;
            }
            j++;
            
           
        }
        return count;
    }
}