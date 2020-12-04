public class Solution {
    public int[] solve(int A, int B, int C, int D) {
        int x = 0;
        int y = 0;
        int z = 0;
        int k = D;
        int[] dp = new int[k+1];
        dp[0] = 1;
        for(int i=1; i<=k; i++){
            int temp = Math.min(A*dp[x],Math.min(B*dp[y],C*dp[z]));
            dp[i]=temp;
            if(temp == A*dp[x])
                x++;
            if(temp == B*dp[y])
                y++;
            if(temp == C*dp[z])
                z++;
        }
        int[] sol = new int[D];
        for(int i=1; i<=D; i++){
            sol[i-1] = dp[i];
        }
        return sol;
    }
}
