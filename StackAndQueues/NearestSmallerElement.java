public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        int n = A.size();
        
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> sol = new ArrayList<>(Collections.nCopies(n,-1));

        for(int i=n-1; i>=0; i--){
            if(st.empty() || A.get(i) >= A.get(st.peek())){
                st.push(i);
            }else{
                while(!st.empty() && A.get(i) < A.get(st.peek())){
                    int ind = st.pop();
                    sol.set(ind, A.get(i));
                }
                st.push(i);
            }
        }


        return sol;
    }
}
