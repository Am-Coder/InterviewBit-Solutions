public class Solution {
    
    public int solve(int[] A, int[][] B, int C) {
        int n = A.length;
        LinkedList<Integer>[] adj = new LinkedList[n];
        for(int i=0; i<n; i++){
            adj[i] = new LinkedList<Integer>();
        }
        for(int i=0; i<B.length; i++){
            adj[B[i][0]-1].add(B[i][1]-1);
            adj[B[i][1]-1].add(B[i][0]-1);
        }
        vis = new boolean[n];
        dfs(adj,A,0,0,C);
        return cnt;
    }         
    int cnt = 0;
    boolean[] vis;
    public void dfs(LinkedList<Integer>[] adj, int[] A, int cur, int gn, int C){
        
        if(vis[cur])
            return;
        
        if(A[cur] == 1){
            gn++;
        }
        
        if( (adj[cur].size() == 1 && cur != 0) || adj[cur].size() ==0){
            if(gn<=C){
                cnt++;
            }
            return;
        }
        
        vis[cur] = true;
        for(int ch: adj[cur]){
            dfs(adj, A, ch, gn, C);
        }
        vis[cur] = false;
    }
    
}
