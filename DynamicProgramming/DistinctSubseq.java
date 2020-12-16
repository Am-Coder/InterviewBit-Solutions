public class Solution {
    public int numDistinct(String s, String t) {
        int dp[][] = new int[s.length()][t.length()];
        for (int[] dpRow : dp) {
            Arrays.fill(dpRow, -1);
        }
        return countWays(s, 0, t, 0, dp);
    }

    public int countWays(String s, int i, String t, int j, int dp[][]) {
        if (j == t.length()) return 1;
        if (i == s.length()) return 0;
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        if (s.charAt(i) == t.charAt(j)) {
            return dp[i][j] = countWays(s, i + 1, t, j + 1,dp) + countWays(s, i + 1, t, j,dp);
        }
        return dp[i][j] = countWays(s, i + 1, t, j, dp);
    }
}
