

    public class Solution {
        
        public int jump(int[] A) {
            int n = A.length;
            int jumps = 0, current_range = 0, next_range = 0;
            
            for(int i = 0; i <= current_range; i++) {
                if(i == A.length - 1) {
                    return jumps;
                }
                
                next_range = Math.max(next_range, A[i] + i);
                
                if(i == current_range) {
                    jumps++;
                    current_range = next_range;
                }
            }
            return -1;        
            
            
            
            // dp = new int[n+1];
            // Arrays.fill(dp,-1);
            
            // minj = Integer.MAX_VALUE;
            // int ans = jumpy(A, 0, n, 0);
            // if(ans == Integer.MAX_VALUE){
            //     return -1;
            // }
            // return ans;
        }
        
        int[] dp;
        int minj;
        public int jumpy(int[] A, int i, int n,int jump){
            if(i >= n-1){
                minj = Math.min(minj,jump);
                return jump;
            }
            
            if(A[i] == 0){
                return Integer.MAX_VALUE;
            }
            
            if(dp[i] != -1){
                return dp[i];
            }
     
            int val = Integer.MAX_VALUE;
            for(int j=i+1; j<=i+A[i]; j++){
                val = Math.min(val, jumpy(A, j, n, jump+1));
            }
            
            return dp[i] = val;
        }
        
    }

