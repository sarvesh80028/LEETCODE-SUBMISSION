class Solution {
    public boolean isAnagram(String s, String t) {
       int n1 = s.length();
       HashMap<Character,Integer>map1 = new HashMap<>();
       for(int i=0;i<n1;i++){
        if(!map1.containsKey(s.charAt(i))) map1.put(s.charAt(i),1);
        else{
            int freq = map1.get(s.charAt(i));
            freq++;
            map1.put(s.charAt(i),freq);
        }
       } 

        int n2 = t.length();
        HashMap<Character,Integer>map2 = new HashMap<>();

       for(int i=0;i<n2;i++){
        if(!map2.containsKey(t.charAt(i))) map2.put(t.charAt(i),1);
        else{
            int freq = map2.get(t.charAt(i));
            freq++;
            map2.put(t.charAt(i),freq);
        }
       }
       if(n1!=n2) return false;

       for(char key : map2.keySet()){
            if(!map1.containsKey(key) || !map1.get(key).equals(map2.get(key))){
        return false;
    }
}
       return true;
    }
}