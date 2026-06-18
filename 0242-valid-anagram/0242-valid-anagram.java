class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ele = s.charAt(i);
            if(!map.containsKey(ele)) map.put(ele,1);
            else{
                map.put(ele,map.get(ele)+1);
            }
        }
        for(int i=0;i<t.length();i++){
            char ele = t.charAt(i);
            if(!map.containsKey(ele)) return false;
            if(map.containsKey(ele)) map.put(ele,map.get(ele)-1);
            if(map.get(ele)==0) map.remove(ele);
        }
        return true;
    }
}