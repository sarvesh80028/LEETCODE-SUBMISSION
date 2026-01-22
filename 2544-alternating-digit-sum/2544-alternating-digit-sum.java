class Solution {
    public int alternateDigitSum(int n) {
        ArrayList<Integer>arr = new ArrayList<>();
        while(n>0){
            int digit = n%10;
            arr.add(digit);
            n = n/10;
        }
        Collections.reverse(arr);
        int pos = 0;
        int neg = 0;
        for(int i=0;i<arr.size();i+=2){
            pos+=arr.get(i);
        }
        for(int i=1;i<arr.size();i+=2){
            neg+=arr.get(i);
        }
        return (pos-neg);
    }
}