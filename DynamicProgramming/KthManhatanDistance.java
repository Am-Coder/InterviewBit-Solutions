public class Solution {
    public int[][] solve(int A, int[][] B) {
        if(A==0)
            return B;
        int n = B.length;
        int m = B[0].length;
        // int[][] dp = B;
        int[][] dp = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++)
                dp[i][j] = B[i][j];
        }
        int[] aa = new int[]{0,0,1,-1};
        int[] bb = new int[]{1,-1,0,0};
                    
        for(int i=1; i<=A; i++){
            for(int j=0; j<n; j++){
                for(int k=0; k<m; k++){

                    int maxi = B[j][k];
                    for(int t=0; t<4; t++){
                        int nx = j + aa[t];
                        int ny = k + bb[t];
                        if(nx >= 0 && ny >= 0 && nx < n && ny < m){
                            maxi = Math.max(maxi, B[nx][ny]);
                        }
                    }
                    dp[j][k] = maxi;
                }
            }
            for(int j=0; j<n; j++){
                for(int k=0; k<m; k++)
                    B[j][k] = dp[j][k];
            }
        }
        return dp;
    
        // int[][] sol = new int[n][m];
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         vis = new boolean[n][m];
        //         int max = findmax(i, j, i, j, B, A, n, m);
        //         sol[i][j] = max;
        //     }
        // }
        // return sol;
    }
    
    
    boolean[][] vis;
    public int findmax(int i, int j, int p, int q, int[][] B, int A, int n, int m){
        if(i<0 || j<0 || i>=n || j>=m || (Math.abs(i-p) + Math.abs(j-q) > A) || vis[i][j] ){
            return -1;
        }
        vis[i][j]=true;
        int[] arr = new int[8];
        int max = -1;
        arr[0] = findmax(i+1,j,p,q,B,A,n,m);
        arr[1] = findmax(i-1,j,p,q,B,A,n,m);
        arr[2] = findmax(i,j+1,p,q,B,A,n,m);
        arr[3] = findmax(i,j-1,p,q,B,A,n,m);
        
        for(int k=0; k<8; k++){
            max = Math.max(arr[k],max);
        }
        
        return Math.max(B[i][j], max);
    }
}
