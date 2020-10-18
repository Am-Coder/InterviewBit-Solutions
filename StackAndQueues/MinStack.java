class Solution {
    Stack<Integer> aux = new Stack<>();
    Stack<Integer> st = new Stack<>();
    public void push(int x) {
        if(aux.empty()){
            aux.push(x);
        }else{
            if(x <= aux.peek()){
                aux.push(x);
            }
        }
        st.push(x);
    }

    public void pop() {
        if(!st.empty()){
            int num = st.pop();
            if(num == aux.peek()){
                aux.pop();
            }
        }
    }

    public int top() {
        if(st.empty()){
            return -1;
        }
        
        return st.peek();
    }
        
    public int getMin() {
        if(aux.empty())
            return -1;
        
        return aux.peek();
    }   
}
