public class Solution {
    LinkedList<Integer> adj[];
    boolean cyclic = false;
    
    public int solve(int A, ArrayList<Integer> B, ArrayList<Integer> C) {
        adj = new LinkedList[A];
        int n = B.size();
        
        for(int i=0; i<A; i++){
            adj[i] = new LinkedList<Integer>();
        }
        
        for(int i=0; i<n; i++){
            adj[B.get(i)-1].add(C.get(i)-1);
        }
        boolean[] st = new boolean[A];
        boolean[] vis = new boolean[A];
        
        for( int i=0; i<A; i++ ) {
            if( !vis[i] ) {
                cyclicUtil(0, st, vis);        
            }
        }        
        return cyclic ? 0:1 ;
    }
    
    public void cyclicUtil(int u, boolean[] st, boolean[] vis){
        if(st[u]){
            cyclic = true;
            return;
        }
        
        if(vis[u]){
            return;
        }
        
        vis[u] = true;
        st[u] = true;
        for(int ch: adj[u]){
            cyclicUtil(ch, st, vis);
        }
        st[u] = false;
    }
}       
        