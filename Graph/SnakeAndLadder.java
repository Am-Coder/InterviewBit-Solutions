public class Solution {
    public int snakeLadder(int[][] A, int[][] B) {
        int[] move = new int[100];
        Arrays.fill(move,-1);

        int n = A.length;
        for(int i=0; i<n; i++){
            move[A[i][0] - 1] = A[i][1] - 1;
        }
        
        n = B.length;
        for(int i=0; i<n; i++){
            move[B[i][0] - 1] = B[i][1] - 1;
        }
        return getMinDiceThrows(move,100);
    }
    
    int getMinDiceThrows(int move[], int n)  
    { 
        int visited[] = new int[n]; 
        Queue<Pair> q = new LinkedList<>(); 
        Pair qe = new Pair(); 
        qe.first = 0; 
        qe.second = 0; 
  
        visited[0] = 1; 
        q.add(qe); 
  
        while (!q.isEmpty())  
        { 
            qe = q.remove(); 
            int v = qe.first; 
            if (v == n - 1) 
                return qe.second; 
  
            for (int j = v + 1; j <= (v + 6) && j < n; ++j)  
            { 
                if (visited[j] == 0) 
                { 
                    Pair a = new Pair(); 
                    a.second = (qe.second + 1); 
                    visited[j] = 1; 
  
                    if (move[j] != -1) 
                        a.first = move[j]; 
                    else
                        a.first = j; 
                    q.add(a); 
                } 
            } 
        } 
  
        return -1; 
    } 
    
    public static class Pair implements Comparable<Pair> {
        int first; // Vertxt
        int second;// Distance
        
        public Pair( int a, int b ) {
            this.first = a;
            this.second = b;
        }
        
        public Pair(){
            
        }
        @Override
        public int compareTo(Pair o) {
            // TODO Auto-generated method stub
            return o.first - first;
        }
        
        
    }
    
}
