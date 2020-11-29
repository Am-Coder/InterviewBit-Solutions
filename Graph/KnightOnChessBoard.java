public class Solution {
    class Pair{
        int x;
        int y;
        int step;
        Pair(int xx, int yy, int ss){
            x = xx;
            y = yy;
            step = ss;
        }
    }
    
    public int knight(int A, int B, int C, int D, int E, int F) {
        boolean[][] vis = new boolean[A+1][B+1];
        Queue<Pair> q = new LinkedList<>();
        HashSet<Pair> hs = new HashSet<>();
        hs.add(new Pair(2,1,0));
        hs.add(new Pair(2,-1,0));
        hs.add(new Pair(-2,1,0));
        hs.add(new Pair(-2,-1,0));
        hs.add(new Pair(1,2,0));
        hs.add(new Pair(1,-2,0));
        hs.add(new Pair(-1,2,0));
        hs.add(new Pair(-1,-2,0));
        q.add(new Pair(C,D,0));
        vis[C][D] = true;
        while(!q.isEmpty()){
            Pair p = q.poll();
            int x = p.x;
            int y = p.y;
            if(x == E && y == F){
                return p.step;
            }
            for(Pair jm: hs){
                if(isSafe(x+jm.x,y+jm.y,A,B) && !vis[x+jm.x][y+jm.y] ){
                    vis[x+jm.x][y+jm.y] = true;
                    q.add(new Pair(x+jm.x, y+jm.y, p.step+1));
                }
            }
        }
        return -1;
    }
    
    boolean isSafe(int C, int D, int A, int B){
        if(C<=0 || D<=0 || C>A || D>B){
            return false;
        }
        return true;
    }
}
