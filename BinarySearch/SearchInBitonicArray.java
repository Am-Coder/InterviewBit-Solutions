public class Solution {
    public int solve(int[] A, int B) {
        int n = A.length;
        int st = 0;
        int end = n-1;
        int ans = -1;
        while(st <= end){
            int mid = (st+end)/2;
            if(B > A[mid]){
                if(mid-1 >=0 && mid+1 >= 0 && A[mid] > A[mid-1] && A[mid] > A[mid+1]){
                    st = mid+1;    
                }else if(A[mid]<A[mid+1]){
                    st = mid+1;
                }else{
                    end = mid -1;
                }
            }else if(B < A[mid]){
                if(mid-1 >=0 && mid+1 >= 0 &&A[mid] > A[mid-1] && A[mid] > A[mid+1]){
                    end = mid-1;    
                } else if(A[mid]<A[mid+1]){
                    end = mid-1;
                }else{
                    st = mid+1;
                }
            }else {
                ans = mid;
                break;
            }
        }
        return ans;
    }
}
