public class Solution {
    public int solve(int A, ArrayList<ArrayList<Integer>> B) {
        LinkedList<Integer>[] adj = new LinkedList[A];
        
        for(int i=0; i<A; i++){
            adj[i] = new LinkedList<Integer>();
        }
        
        for(int i=0; i<B.size(); i++){
            adj[B.get(i).get(0)-1].add(B.get(i).get(1)-1);
        }
        ans = false;
        vis = new boolean[A];
        dfs(adj, 0, A);
        
        
        return ans ? 1 : 0 ;
    }
    
    boolean ans;
    boolean[] vis;
    public void dfs(LinkedList<Integer>[] adj, int n, int A){
        
        if(vis[n] || ans){
            return;
        }
        if(n == A-1){
            ans = true;
            return;
        }
        vis[n] = true;
        for(int ch: adj[n]){
            dfs(adj, ch, A);
        }
        vis[n] = false;
    }
    
}
