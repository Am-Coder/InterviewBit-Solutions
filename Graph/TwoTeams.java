public class Solution {
    int[] num;
    public int solve(int A, int[][] B) {
        LinkedList<Integer>[] adj = new LinkedList[A];
        num = new int[A];
        
        for(int i=0; i<A; i++){
            adj[i] = new LinkedList<Integer>();
        }
        
        for(int i=0; i<B.length; i++){
            adj[B[i][0] - 1].add(B[i][1] - 1);
            adj[B[i][1] - 1].add(B[i][0] - 1);
        }
        boolean[] vis = new boolean[A];
        
        for(int u=0; u<A; u++){

            if(!vis[u]){
                odd = false;
                chkCycle(adj, u, vis, -1,0);
                if(odd){
                    return 0;
                }
            }
        }
        
        return 1;
        
    }

    boolean odd = false;
    public void chkCycle(LinkedList<Integer>[] adj, int n, boolean[] vis, int par, int len){
        
        if(odd){
            return;
        }
        vis[n] = true;
        num[n] = len;
        for(int ch : adj[n]){
            if(odd){
                return;
            }
            if(!vis[ch]){
                chkCycle(adj, ch, vis, n, len+1);
            }else if(ch != par){
                if((len - num[ch])%2 == 0){
                    odd = true;
                    return;
                }
            }
        }
    }
    
}
