class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if(n%2!=0) return false;
        Stack<Character>st = new Stack<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            if(s.charAt(i)==')'){
                if(st.size()>0 && st.peek()=='(') st.pop();
                else return false;
            }
            if(s.charAt(i)=='}'){
                if(st.size()>0 && st.peek()=='{') st.pop();
                else return false;
            }
            if(s.charAt(i)==']'){
                if(st.size()>0 && st.peek()=='[') st.pop();
                else return false;
            }
        }
        if(st.size()==0) return true;
        return false;
    }
}