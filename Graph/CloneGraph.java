/**     
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };   
 */     
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        Queue<UndirectedGraphNode> q = new LinkedList<>();
        HashMap<UndirectedGraphNode, UndirectedGraphNode> hm = new HashMap<>();
        q.add(node);
        hm.put(node, new UndirectedGraphNode(node.label));
        while(!q.isEmpty()){
            UndirectedGraphNode nn = q.poll();
            UndirectedGraphNode clone = hm.get(nn);
            if(nn.neighbors.size() != 0){
                for(UndirectedGraphNode chi: nn.neighbors){
                    UndirectedGraphNode cloneChi = hm.get(chi);
                    if(cloneChi == null){
                        q.add(chi);
                        cloneChi = new UndirectedGraphNode(chi.label);
                        hm.put(chi,cloneChi);
                    }
                    clone.neighbors.add(cloneChi);
                }
            }
        }
        
        return hm.get(node);
    }   
}       
        