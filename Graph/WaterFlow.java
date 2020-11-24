public class Solution {
    class Pair{
        int x;
        int y;
        String s;
        Pair(int xx,int yy){
            x = xx;
            y = yy;
            s = xx + " " + yy;
        }
    } 
    
    public int solve(int[][] A) {
        HashSet<String> r = new HashSet<>();
        HashSet<String> b = new HashSet<>();
        Queue<Pair> q = new LinkedList<>();
        for(int i = 0 ; i < A.length ; i++){
            Pair p = new Pair(i,0);
            q.add(p);
        }
        for(int j = 1 ; j < A[0].length ; j++){
            Pair p = new Pair(0,j);
            q.add(p);
        }
        bfs(q, b, A);
        
        q.clear();
        for(int i = 0 ; i < A.length ; i++){
            Pair p = new Pair(i,A[0].length-1);
            q.add(p);
        }
        for(int j = 0 ; j < A[0].length -1 ; j++){
            Pair p = new Pair(A.length-1,j);
            q.add(p);
        }
        bfs(q, r, A);
        int c = 0;
        for(String k : r){
            if( b.contains(k) ) c++;
        }
        return c;
    }
    public void bfs(Queue<Pair> q, HashSet<String> r,int[][] A){

        while(q.size() > 0 ){
            Pair p = q.remove();
            if(r.contains(p.s)) continue;
                r.add(p.s);
            
            if(p.x+1 < A.length && A[p.x+1][p.y] >= A[p.x][p.y] ){
                Pair pp = new Pair(p.x+1,p.y);
                if(!r.contains(pp.s)){
                    q.add(pp);
                }
            }
            
            if(p.x-1 >= 0 && A[p.x-1][p.y] >= A[p.x][p.y] ){
                Pair pp = new Pair(p.x-1,p.y);
                if(!r.contains(pp.s)){
                    q.add(pp);
                }
            }
            
            if(p.y+1 < A[0].length && A[p.x][p.y+1] >= A[p.x][p.y] ){
                Pair pp = new Pair(p.x,p.y+1);
                if(!r.contains(pp.s)){
                    q.add(pp);
                }
            }
            
            if(p.y-1 >= 0 && A[p.x][p.y-1] >= A[p.x][p.y] ){
                Pair pp = new Pair(p.x,p.y-1);
                if(!r.contains(pp.s)){
                    q.add(pp);
                }
            }
        }
    }
    

}
