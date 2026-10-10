class pair{
    int element;
    int index;
    pair(int element,int index){
        this.element = element;
        this.index = index;
    }
}

class Solution {
    public int[] dailyTemperatures(int[] nums) {
        int n = nums.length;
        int[]ans = new int[n];
        Stack<pair>st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(st.size()>0 && nums[i]>=st.peek().element) st.pop();
            if(st.size()==0) ans[i] = 0;
            else ans[i] = st.peek().index-i;
            st.push(new pair(nums[i],i));
        }
        return ans;
    }
}