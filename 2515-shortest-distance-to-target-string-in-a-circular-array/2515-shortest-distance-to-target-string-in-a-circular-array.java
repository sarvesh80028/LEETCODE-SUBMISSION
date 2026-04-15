class Solution {
    public int closestTarget(String[] words, String target, int start) {
        int n = words.length;
        int left = -1,right = -1;
        int x = 0;
        int Min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(words[i].equals(target)){
                right = (i-start+n)%n;
                left = (start-i+n)%n;
                x = Math.min(left,right);
                Min = Math.min(x,Min);
            }
            //Min = Math.min(x,Min);
        }
        if(Min==Integer.MAX_VALUE) return -1;
        return Min;
    }
}