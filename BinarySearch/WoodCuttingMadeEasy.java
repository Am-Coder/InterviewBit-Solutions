public class Solution {
    public int solve(int[] A, int B) {
        int n = A.length;
        int max = -1;
        for(int i=0; i<n; i++){
            max = Math.max(max, A[i]);
        }
        
        int st = 0;
        int end = max;
        int ans = 0;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(ispossible(A, mid, B)){
                ans = Math.max(ans,mid);
                st = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return ans;
    }
    
    boolean ispossible(int[] A, int mid, int B){
        int sum =0;
        for(int i=0; i<A.length; i++){
            sum += A[i] - mid > 0 ? A[i] - mid : 0;
            if(sum>=B)
                return true;
        }
        return false;
    }
}
