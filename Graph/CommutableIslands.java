public class Solution {
    class Node{
        int src;
        int dest;
        int wt;
        Node(){
            
        }
        Node(int s, int d, int wt){
            this.src = s;
            this.dest = d;
            this.wt = wt;
        }
    }
    
    class QNode implements Comparable<QNode>{
        int key;
        int vertex;
        
        QNode( int key, int ver ){
            this.key = key;
            this.vertex = ver;
        }
        @Override
        public int compareTo(QNode o2) {
            // TODO Auto-generated method stub
            return this.key - o2.key;
        }
        
    }
    
    class Graph{
        int V;
        LinkedList<Node>[] adj;
        
        Graph(int V){
            this.V = V;
            adj = new LinkedList[V];
            for( int i=0; i<V; i++ ) {
                adj[i] = new LinkedList<>();
            }
        }
        
        void addEdge(int s, int d, int w ) {
            adj[s].add(new Node(s,d,w));
            adj[d].add(new Node(d,s,w));
        }
        
        int PrimsMST() {
            
            //Heap to handle finding minimum key value
            QNode[] arr = new QNode[V];
            Queue<QNode> q = new PriorityQueue<QNode>();
            
            //Whether vertex is present in set of MST vertices
            boolean[] mtset = new boolean[V];
            
            //Stores parent of vertex
            int[] parent = new int[V]; 
            
            for( int i=0; i<V; i++ ) {
                mtset[i] = false;
                arr[i] = new QNode(Integer.MAX_VALUE, i);
                
            }
            arr[0].key = 0;
            mtset[0] = true;
            
            for( int i=0; i<V; i++ ) {
                q.add(arr[i]);
            }
            
            while( !q.isEmpty() ) {
                QNode qn = q.poll();
                mtset[qn.vertex] = true;
                for( Node n: adj[qn.vertex] ) {
                    if( mtset[n.dest] == false ) {
                        if( arr[n.dest].key > n.wt ) {
                            q.remove(arr[n.dest]);
                            arr[n.dest].key = n.wt;
                            q.add(arr[n.dest]);
                            parent[n.dest] = qn.vertex;
                        }
                    }
                }
            }
            int sum = 0;
            for (int o = 1; o < V; o++) {
                for (Node ch : adj[o]) {
                    if (ch.dest == parent[o]) {
                        sum += ch.wt;
                    }
                }
            }  
           return sum;
        }
    }
    
    
    public int solve(int A, ArrayList<ArrayList<Integer>> B) {
        Graph g = new Graph(A);
        for(int i=0; i<B.size(); i++){
            g.addEdge(B.get(i).get(0)-1, B.get(i).get(1)-1, B.get(i).get(2));
        }
        return g.PrimsMST();
    }
}
