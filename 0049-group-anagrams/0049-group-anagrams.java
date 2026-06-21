class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        HashMap<String,ArrayList<String>>map = new HashMap<>();
        for(int i=0;i<n;i++){
            String x = strs[i];
            char[] a = x.toCharArray();
            Arrays.sort(a);
            String y = new String(a);
            if(!map.containsKey(y)){
                map.put(y,new ArrayList<>());
        }
            map.get(y).add(strs[i]);
        }
        List<List<String>>arr = new ArrayList<>(map.values());
        return arr;
    }
}