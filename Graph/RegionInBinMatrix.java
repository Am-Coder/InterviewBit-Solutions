public class Solution {
    public int solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        boolean[][] vis = new boolean[n][m];
        int len = 0;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(A[i][j] == 1 && !vis[i][j]){
                    mlen = 0;
                    dfs(A,vis,i,j,n,m);
                    len = Math.max(len, mlen);
                }
            }
        }
        
        return len;
    }
    
    int mlen = 0;
    
    public void dfs(int[][] A, boolean[][] vis, int i, int j, int n, int m){
        if(i<0 || j<0 || i>=n || j>=m || A[i][j] == 0 || vis[i][j]){
            return;
        }
        vis[i][j] = true;
        mlen++;
        dfs(A,vis,i+1,j,n,m);
        dfs(A,vis,i-1,j,n,m);
        dfs(A,vis,i,j+1,n,m);
        dfs(A,vis,i,j-1,n,m);
        dfs(A,vis,i+1,j+1,n,m);
        dfs(A,vis,i-1,j-1,n,m);
        dfs(A,vis,i-1,j+1,n,m);
        dfs(A,vis,i+1,j-1,n,m);
    }
    
}
