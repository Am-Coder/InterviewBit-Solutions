public class Solution {
    boolean[][] vis;
    
    public class Pair{
        int x;
        int y;
        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    
    HashSet<Pair> hs;
    boolean ans;
    public void solve(ArrayList<ArrayList<Character>> a) {
        int n = a.size();
        int m = a.get(0).size();
        vis = new boolean[n][m];
        hs = new HashSet<>();
        for(int i=0; i<n; i++){
            
            for(int j=0; j<m; j++){
                if(a.get(i).get(j) == 'O' && !vis[i][j]){
                    ans = true;
                    hs.clear();
                    dfs(a,i,j,n,m);
                }   
                if(ans)
                    for(Pair p: hs){
                        a.get(p.x).set(p.y,'X');
                    }
            }
            
        }
    }
    
    public void dfs(ArrayList<ArrayList<Character>> a, int i, int j, int n, int m){
        if(i<0 || j<0 || i>=n || j>= m || a.get(i).get(j) == 'X' || vis[i][j]){
            return;
        }
        
        if( (i == n-1 || j == m-1 || i == 0 || j == 0) && (a.get(i).get(j) == 'O') ){
            ans = false;
        }
        
        vis[i][j] = true;
        hs.add(new Pair(i,j));
        dfs(a,i+1,j,n,m);
        dfs(a,i-1,j,n,m);
        dfs(a,i,j+1,n,m);
        dfs(a,i,j-1,n,m);
        
        
    }
}
