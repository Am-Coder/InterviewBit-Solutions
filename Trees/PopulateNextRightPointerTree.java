

    /**
     * Definition for binary tree with next pointer.
     * public class TreeLinkNode {
     *     int val;
     *     TreeLinkNode left, right, next;
     *     TreeLinkNode(int x) { val = x; }
     * }
     */
    public class Solution {
        public void connect(TreeLinkNode root) {
            Queue<TreeLinkNode> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                TreeLinkNode prev = q.poll();
                Queue<TreeLinkNode> aux = new LinkedList<>();
                
                if(prev.left != null){
                    aux.add(prev.left);
                }
                
                if(prev.right != null){
                    aux.add(prev.right);
                }
                
                while(!q.isEmpty()){
                    TreeLinkNode rr = q.poll();
                    prev.next = rr;
                    prev = rr;
                    if(rr.left != null){
                        aux.add(rr.left);
                    }
                    
                    if(rr.right != null){
                        aux.add(rr.right);
                    }
                }
                q.addAll(aux);
            }
        }
    }

