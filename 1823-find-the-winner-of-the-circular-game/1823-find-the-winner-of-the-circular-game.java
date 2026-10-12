class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer>q = new ArrayDeque<>();
        for(int i=1;i<=n;i++){
            q.offer(i);
        }
        while(q.size()>1){
            for(int i=1;i<=k-1;i++){
                int x = q.remove();
                q.offer(x);
            }
            q.remove();
            // for(int i=1;i<=q.size()-k;i++){
            //     int x = q.remove();
            //     q.offer(x);
            // }
        }
        return q.peek();
    }
}