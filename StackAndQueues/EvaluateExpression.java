public class Solution {
    public int evalRPN(ArrayList<String> A) {
        Stack<Integer> st = new Stack<>();
        int n = A.size();
        for(int i=0; i<n; i++){
            String str = A.get(i);
            if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
                int b = st.pop();
                int a = st.pop();
                int res = 0;
                if(str.equals("+")){
                    res = a + b;
                }else if(str.equals("-")){
                    res = a - b;
                }else if(str.equals("*")){
                    res = a*b;
                }else{
                    res = a / b;
                }
                st.push(res);
            }else{
                st.push(Integer.parseInt(A.get(i)));
            }
        }
        
        return st.pop();
    }
}
