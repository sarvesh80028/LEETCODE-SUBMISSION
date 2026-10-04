class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>result = new ArrayList<>();
        List<Integer>current = new ArrayList<>();
        ans(1,0,k,n,current,result);
        return result;
    }
    private void ans(int idx,int count,int k,int n,List<Integer>current,List<List<Integer>>result){
        if(n==0){
            if(count==k){
                result.add(new ArrayList<>(current));
            }
            return;
        }
        for(int i=idx;i<=9;i++){
            if(i<=n){
            current.add(i);
            ans(i+1,count+1,k,n-i,current,result);
            current.remove(current.size()-1);
            
        }
        // if(current.size()>0) current.remove(current.size()-1);
        // ans(count-1,k,n,current,result);
        }
    }
}