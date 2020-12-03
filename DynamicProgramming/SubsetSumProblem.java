public class Solution {
    public int solve(int[] A, int B) {
        dp = new int[A.length+1][B+1];
        for(int i=0; i<=A.length; i++){
            Arrays.fill(dp[i],-1);
        }
        return calc(A,0,B);
    }
    int[][] dp;
    public int calc(int[] arr, int i, int B){
        if(B == 0){
            return 1;
        }
        if(B < 0 || i == arr.length){
            return 0;
        }
        
        if(dp[i][B] != -1){
            return dp[i][B];
        }
        return dp[i][B] = (calc(arr,i+1,B) | calc(arr,i+1,B-arr[i]));
    }
}
