public class Solution {
    
    class Pair {
        String x;
        int y;
        Pair(String x, int y){
            this.x = x;
            this.y = y;
        }
    }
    
    public String multiple(int A) {

        String val = "1";
        int R = 1;
        boolean[] vis = new boolean[A];
        if(A == 1)
            return val;
        
        Queue<Pair> q = new LinkedList<>();
        Set<Integer> visit = new HashSet<>();        
        q.add(new Pair(val,R%A));
        while(!q.isEmpty()){
            Pair p = q.poll();
            R = p.y;
            if(R == 0){
                return p.x;
            } else if(!vis[R]){
                int r1 = (10*R)%A;
                int r2 = (10*R + 1)%A;
                vis[R] = true;
                q.add(new Pair( p.x+"0", r1));
                q.add(new Pair( p.x+"1", r2));
            }
        }
        return val;
    }

}
