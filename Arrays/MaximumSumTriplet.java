public class Solution {
    public int solve(int[] A) {
        int n = A.length;
        int[] suff = new int[n];
        suff[n-1] = A[n-1];
        for(int i=n-2; i>=0; i--){
            suff[i] = Math.max(A[i], suff[i+1]);
        }
        
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(A[0]);
        int sum = 0;
        for(int i=1; i<n-1; i++){
            Integer ll = ts.lower(A[i]);
            if(A[i] < suff[i+1] && ll != null){
                sum = Math.max(sum, ll + A[i] + suff[i+1]);
            }
            ts.add(A[i]);
        }
        
        return sum;
    }
}
