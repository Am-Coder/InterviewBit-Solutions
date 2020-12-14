public class Solution {
    int[][][] dp;
    int MOD = 1003;

    public int cnttrue(String A) {
        int n = A.length();
        dp = new int[2][n + 1][n + 1];
        for (int l = 0; l < 2; l++)
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    dp[l][i][j] = -1;
        return parenthesize(A, 0, n-1, 1);
    }
    
    int parenthesize(String str, int i, int j, int sol) {
        if (i > j)
            return dp[sol][i][j]=0;
        
        
        if(dp[sol][i][j] != -1)
            return dp[sol][i][j];
        
        if (i == j) {
            if (sol == 1)
                return dp[sol][i][i] = (str.charAt(i) == 'T' ? 1 : 0);
            else
                return dp[sol][i][i] = (str.charAt(i) == 'F' ? 1 : 0);
        }
        

            
        int ans = 0;
        for (int k = i + 1; k < j; k+=2) {
            if (dp[1][i][k - 1] == -1) {
                dp[1][i][k - 1] = parenthesize(str, i, k - 1, 1);
            }
            int lt = parenthesize(str, i, k - 1, 1);
            
            if (dp[0][i][k - 1] == -1) {
                dp[0][i][k - 1] = parenthesize(str, i, k - 1, 0);
            }
            int lf = parenthesize(str, i, k - 1, 0);
            
            if (dp[1][k + 1][j] == -1) {
                dp[1][k + 1][j] = parenthesize(str, k + 1, j, 1);
            }
            int rt = parenthesize(str, k + 1, j, 1);
            
            if (dp[0][k + 1][j] == -1) {
                dp[0][k + 1][j] = parenthesize(str, k + 1, j, 0);
            }
            int rf = parenthesize(str, k + 1, j, 0);
            
            if (str.charAt(k) == '|') {
                if (sol==1) {
                    ans = (ans + lt * rt + lt * rf + rt * lf)%MOD;
                } else {
                    ans = (ans + lf * rf)%MOD;
                }
            } else if (str.charAt(k) == '&') {
                if (sol==1) {
                    ans = (ans + lt * rt)%MOD;
                } else {
                    ans = (ans + lt * rf + rt * lf + lf * rf)%MOD;
                }
            } else if (str.charAt(k) == '^') {
                if (sol==1) {
                    ans = (ans + rf * lt + lf * rt)%MOD;
                } else {
                    ans = (ans + lf * rf + lt * rt)%MOD;
                }
            }
        }
        
        return dp[sol][i][j] = ans%MOD;
    }

}
