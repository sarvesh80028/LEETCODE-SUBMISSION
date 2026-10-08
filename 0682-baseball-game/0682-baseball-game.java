class Solution {
    public int calPoints(String[] nums) {
        int n = nums.length;
        Stack<Integer>st = new Stack<>();
        for(int i=0;i<n;i++){
            if(nums[i].equals("C")){
                if(st.size()>0) st.pop();
            }
            else if(nums[i].equals("D")){
                st.push(2*st.peek());
            }
            else if(nums[i].equals("+")){
                if(st.size()>1){
                    int top = st.pop();
                    int Stop = st.peek();
                    st.push(top);
                    st.push(top + Stop);
                }
            }
            else{
                st.push(Integer.parseInt(nums[i]));
            }
        }
        int sum = 0;
        for(int ele:st){
            sum+= ele;
        }
        return sum;
    }
}