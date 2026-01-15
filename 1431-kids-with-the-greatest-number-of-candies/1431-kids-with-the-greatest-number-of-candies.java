class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int x) {
        int n = candies.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(candies[i]>=max) max = candies[i];
        }
        List<Boolean>arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(candies[i]+x>=max){
                arr.add(true);
            }
            else arr.add(false);
        }
        return arr;
    }
}