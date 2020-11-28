

    public class Solution {
     
     
        boolean isSafe(int x, int y, int A, int B){
            return x>=0 && y>=0 && x<A && y<B;
        }
        
        class Triplet{
            int cost;
            int i;
            int j;
            
            Triplet(int x, int y, int z){
                this.cost = x;
                this.i = y;
                this.j = z;
            }
            
        }
        
        class Pair{
            int first;
            int second;
            
            Pair(int x, int y){
                this.first = x;
                this.second = y;
            }
        }
        
        public int solve(int A, int B, String[] C) {
     
            Deque<Triplet> dq = new LinkedList<>();
            boolean[][] visit = new boolean[A][B];
            HashMap<Character,Pair> hm = new HashMap<>();
            hm.put('U', new Pair(-1,0));
            hm.put('D', new Pair(1,0));
            hm.put('L', new Pair(0,-1));
            hm.put('R', new Pair(0,1));
            dq.add( new Triplet(0, 0, 0) );
            while(!dq.isEmpty()){
                Triplet tp = dq.poll();
                visit[tp.i][tp.j] = true;
                if(tp.i == A-1 && tp.j == B-1) return tp.cost;
                for(char key: hm.keySet()){
                    int nx = tp.i + hm.get(key).first;
                    int ny = tp.j + hm.get(key).second;
                    if( isSafe(nx,ny,A,B) && !visit[nx][ny] ){
                        if( C[tp.i].charAt(tp.j) == key ) dq.addFirst(new Triplet(tp.cost, nx, ny));
                        else dq.addLast(new Triplet(tp.cost+1, nx, ny));
                    }
                }
            }
            return -1;
     
        // -------------------DFS BASED , gives time out --------------------------- 
            // minc = Integer.MAX_VALUE;
            // vis = new boolean[A][B];
            // dfs(A,B,C,0,0,0);
            // return minc;
        // -------------------------------------------------------------------------
     
     
        }
     
     
        // DFS based solution
        int minc;
        boolean[][] vis;
        public void dfs(int A, int B, String[] C, int i, int j, int cost){
            if(i<0 || j<0 || i>=A || j>=B || minc == 0 || cost > A + B - 2 || vis[i][j] || cost>minc){
                return;
            }
            
            if(i == A-1 && j == B-1){
                minc = Math.min(cost,minc);
                return;
            }
            vis[i][j] = true;
            if(C[i].charAt(j) == 'U'){
                dfs(A,B,C,i-1,j,cost);
                if(minc == 0){
                    return;
                }
                dfs(A,B,C,i+1,j,cost+1);
                dfs(A,B,C,i,j+1,cost+1);
                dfs(A,B,C,i,j-1,cost+1);
            } else if(C[i].charAt(j) == 'R'){
                dfs(A,B,C,i,j+1,cost);
                if(minc == 0){
                    return;
                }
                dfs(A,B,C,i-1,j,cost+1);
                dfs(A,B,C,i+1,j,cost+1);
                dfs(A,B,C,i,j-1,cost+1);
            } else if(C[i].charAt(j) == 'L'){
                dfs(A,B,C,i,j-1,cost);
                if(minc == 0){
                    return;
                }
                dfs(A,B,C,i+1,j,cost+1);
                dfs(A,B,C,i,j+1,cost+1);
                dfs(A,B,C,i-1,j,cost+1);
            } else if(C[i].charAt(j) == 'D'){
                dfs(A,B,C,i+1,j,cost);
                if(minc == 0){
                    return;
                }
                dfs(A,B,C,i-1,j,cost+1);
                dfs(A,B,C,i,j+1,cost+1);
                dfs(A,B,C,i,j-1,cost+1);
            }
     
            
            vis[i][j] = false;
        }
    }

