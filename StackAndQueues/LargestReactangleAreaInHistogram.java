public class Solution {
    public int largestRectangleArea(ArrayList<Integer> A) {
        int n = A.size();
        Stack<Integer> st = new Stack<>();
        int max = 0;
        int i=0;
        for(i=0; i<n; i++){
            if(st.empty() || A.get(i) >= A.get(st.peek())){
                st.push(i);
            }else{
                while(!st.empty() && A.get(i) < A.get(st.peek())){
                    int tp = st.peek(); 
                    st.pop(); 
                    int area = A.get(tp) * (st.empty() ? i : i - st.peek() - 1); 
                    max = Math.max(area,max);
                }
                st.push(i);
            }
        }
        
        while(!st.empty()){
                int tp = st.peek(); 
                st.pop(); 
                int area = A.get(tp) * (st.empty() ? i : i - st.peek() - 1); 
                max = Math.max(area,max);
        }
        
        return max;
    }
}
