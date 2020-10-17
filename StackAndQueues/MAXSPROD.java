public class Solution {
    long mod = (long)1e9 + 7;
    public int maxSpecialProduct(int[] A) {
        int n = A.length;
        if(n<=2)
            return 0;
        long sol = 0;
        int[] left = new int[n];
        int[] right = new int[n];
        
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i=1; i<n; i++){
            if(!st.empty() && A[i] > A[st.peek()]){
                while(!st.empty() && A[i] > A[st.peek()]){
                    right[st.pop()] = i;
                }
                st.push(i);
            }else{
                st.push(i);
            }
        }
        while(!st.empty()){
            right[st.pop()] = -1;
        }
        st.clear();
        
        st.push(n-1);
        for(int i=n-2; i>=0; i--){
            if(!st.empty() && A[i]>A[st.peek()]){
                while(!st.empty() && A[i]>A[st.peek()]){
                    left[st.pop()] = i;
                }
                st.push(i);
            }else{
                st.push(i);
            }
        }
        while(!st.empty()){
            left[st.pop()] = -1;
        }
        for(int i=1; i<n-1; i++){
            if(left[i]>0 && right[i]>0){
                sol = Math.max(sol, (((long)left[i])*((long)right[i])));
            }
        }
        return (int)(sol%mod);
    }
}
