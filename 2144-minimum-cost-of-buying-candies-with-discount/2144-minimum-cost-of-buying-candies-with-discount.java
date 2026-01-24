class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int mrp = 0;
        int n = cost.length;
        int a = 0;
        for(int i=n-1;i>=0;i--){
            if(a==2){
                a = 0;
                continue;
            }
            else{
            mrp+= cost[i];
            a++;
            }
        }
        return mrp;
    }
}