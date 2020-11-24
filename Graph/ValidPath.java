

    public class Solution {
        boolean[][] vis;
        public String solve(int A, int B, int C, int D, int[] E, int[] F) {
            vis = new boolean[A+1][B+1];
            ans = false;
            dfs(0,0,A,B,C,D,E,F);
            return ans ? "YES":"NO";
        }
        boolean ans = false;
        public void dfs(int x, int y, int a, int b, int c, int d, int[] e, int[] f){
            if(ans || x < 0 || y < 0 || x > a || y > b || vis[x][y]){
                return;
            }
            if(chkOutCircle(x,y,e,f,d)){
                vis[x][y] = true;
                if(x == a && y == b){
                    ans = true;
                    return;
                }
                dfs(x+1,y,a,b,c,d,e,f);
                dfs(x,y+1,a,b,c,d,e,f);
                dfs(x+1,y+1,a,b,c,d,e,f);
                
                dfs(x-1,y,a,b,c,d,e,f);
                dfs(x,y-1,a,b,c,d,e,f);
                dfs(x-1,y-1,a,b,c,d,e,f);
                
                dfs(x-1,y+1,a,b,c,d,e,f);
                dfs(x+1,y-1,a,b,c,d,e,f);
            }else{
                return;
            }
            
        }
        
        public boolean chkOutCircle(int a, int b, int[] e, int[] f, int r){
            int n = e.length;
            
            for(int i=0; i<n; i++){
                if( ((a - e[i])*(a - e[i]) + (b - f[i])*(b - f[i])) <= r*r){
                    return false;
                }
            }
            return true;
        }
    }
