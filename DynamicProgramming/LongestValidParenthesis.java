public class Solution {
    public int longestValidParentheses(String A) {
        char[] arr = A.toCharArray();
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int max = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == '('){
                st.push(i);
            }else{
                if(!st.empty())
                    st.pop();
                if(!st.empty()){
                    max = Math.max(max,i-st.peek());
                }else{
                    st.push(i);
                }
            }
        }
        return max;
    }
}
