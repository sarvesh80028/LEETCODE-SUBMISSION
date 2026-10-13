class MyQueue {

    Stack<Integer>st1 = new Stack<>();
    Stack<Integer>st2 = new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        st1.push(x);
    }
    
    public int pop() {
        int m = st1.size();
        int n = st2.size();
        while(st1.size()>0){
            st2.push(st1.pop());
        }
        int top = st2.pop();
        for(int i=1;i<m;i++){
            st1.push(st2.pop());
        }
        return top;
    }
    
    public int peek() {
        int m = st1.size();
        while(st1.size()>0){
            st2.push(st1.pop());
        }
        int top = st2.peek();
        for(int i=1;i<=m;i++){
            st1.push(st2.pop());
        }
        return top;
    }
    
    public boolean empty() {
        if(st1.size()==0 && st2.size()==0) return true;
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */