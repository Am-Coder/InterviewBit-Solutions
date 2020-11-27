

     public class Solution {
        int find(int parent[], int i) 
        { 
            if (parent[i] == -1) 
                return i; 
            return find(parent, parent[i]); 
        } 
      
        void union(int parent[], int x, int y) 
        { 
            int xset = find(parent, x); 
            int yset = find(parent, y); 
            if(xset != yset)
                parent[xset] = yset; 
        } 
        
        public int solve(int[] A, int[] B, int[][] C) {
            ArrayList<Integer> diff = new ArrayList<>();
            int n = A.length;
            
                
            int[] parent = new int[n+1];
            for(int i=0; i<=n; i++){
                parent[i] = -1;
            }
            
            for(int i=0; i<C.length; i++){
                int x = A[C[i][0]-1];
                int y = A[C[i][1]-1];
                union(parent, x, y);
            }
            for(int i=0; i<n; i++){
                if(A[i] != B[i]){
                    int x = find(parent,A[i]);
                    int y = find(parent,B[i]);
                    if(x!=y){
                        return 0;
                    }        
                }
            }
            
            return 1;
        }
    }

