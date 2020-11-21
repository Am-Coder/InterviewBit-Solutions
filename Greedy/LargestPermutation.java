public class Solution {
    public int[] solve(int[] A, int B) {
        int n = A.length;
        int[] hm = new int[n+1];
        
        if(B >= A.length){
            for(int i=0; i<n; i++){
                A[n-1-i] = i+1;
            }
            return A;
        }
        
        for(int i=0; i<A.length; i++){
            hm[A[i]] = i;
        }
        int sw = 0, ind = 0, emp = 0, exc = 0;
        for(int i=0; i<n; i++){
            if(A[i] != n-i){
                sw++;
                ind = hm[n-i];
                exc = A[i];
                
                // swap(A, i, ind);
                emp = A[i];
                A[i] = A[ind];
                A[ind] = emp;   
                
                hm[n-i] = i;
                hm[exc] = ind;
            }
            if(sw >= B)
                break;
        }
        return A;
    }

}
