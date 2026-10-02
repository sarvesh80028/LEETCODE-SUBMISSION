class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>result = new ArrayList<>();
        generate(0,0,n,"",result);
        return result;
    }
    private void generate(int l,int r,int n,String s,List<String>result){
        if(l==r && r==n){
            result.add(s);
            return;
        }
        if(l<n) generate(l+1,r,n,s+"(",result);
        if(r<l) generate(l,r+1,n,s+")",result);
    }
}