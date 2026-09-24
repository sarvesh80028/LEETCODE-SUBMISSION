class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        ArrayList<Integer>b = new ArrayList<>();
        for(int i=0;i<baskets.length;i++){
            b.add(baskets[i]);
        }
        int count = 0;
        for(int i=0;i<fruits.length;i++){
            int flag = 0;
            for(int j=0;j<b.size();j++){
                if(fruits[i]<=b.get(j)){
                    flag = 1;
                    b.remove(j);
                    break;
                }
            }
            if(flag==0) count++;
        }
        return count;   
    }
}