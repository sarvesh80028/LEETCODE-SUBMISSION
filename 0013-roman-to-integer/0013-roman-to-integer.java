class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer>map = new HashMap<>();
        int n = s.length();
        int sum = 0;
        for(int i=0;i<n;i++){
            map.put('I',1);
            map.put('V',5);
            map.put('X',10);
            map.put('L',50);
            map.put('C',100);
            map.put('D',500);
            map.put('M',1000);
        }
        for(int i=0;i<n-1;i++){
            int curr = map.get(s.charAt(i));
            int next = map.get(s.charAt(i+1));
            if(curr<next) sum-=map.get(s.charAt(i));
            else sum+=map.get(s.charAt(i));
        }
        sum+=map.get(s.charAt(n-1));
        return sum;
    }
}