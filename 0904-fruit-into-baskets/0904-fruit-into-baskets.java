class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        int maxlen = 0;
        int i = 0, j = 0;
        while(j<n){
           
            if(!map.containsKey(fruits[j])){
                map.put(fruits[j],1);
            }
            else{
                int freq = map.get(fruits[j]);
                freq++;
                map.put(fruits[j],freq);
            }

            while(map.size()>2){
                int freq = map.get(fruits[i]);
                freq--;
                if(freq==0){
                    map.remove(fruits[i]);
                }
                else{
                    map.put(fruits[i],freq);
                }
                i++;
            }
            maxlen = Math.max(maxlen,j-i+1); 
           
            j++;
        }
        return maxlen;
    }
}