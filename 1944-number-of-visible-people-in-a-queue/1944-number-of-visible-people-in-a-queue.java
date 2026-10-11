class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        Stack<Integer>st = new Stack<>();
        int[]arr = new int[n];
        st.push(heights[n-1]);
        arr[n-1] = 0;
        for(int i=n-2;i>=0;i--){
            int count = 0;
            while(st.size()>0 && heights[i]>st.peek()){
                st.pop();
                count++;
            }
            if(st.size()>0) count++;
            arr[i] = count;
            st.push(heights[i]);
        }
        return arr;
    }
}