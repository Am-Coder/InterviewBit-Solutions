public class Solution {
    public int numTrees(int A) {
        dp = new int[A+1][A+1];
        for(int i=0; i<=A; i++)
            Arrays.fill(dp[i], -1);
        return mcm(1,A);
    }
    int[][] dp;
    public int mcm(int i, int j){
        if(i > j)
            return 0;
        if(i == j){
            return 1;
        }
        if(dp[i][j] != -1)
            return dp[i][j];
        
        int sum =0;
        for(int k=i; k<=j; k++){
            int left = mcm(i,k-1);
            int right = mcm(k+1,j);
            if(left == 0 && right != 0){
                sum += right;
            }else if( left != 0 && right == 0)
                sum += left;
            else
                sum += left*right;
        }
        return dp[i][j] = sum;
    }
}
