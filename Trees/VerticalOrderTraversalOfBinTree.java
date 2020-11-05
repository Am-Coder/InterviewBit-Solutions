/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    static class QNode{
        TreeNode n;
        int hd;
        
        QNode(TreeNode n, int hd){
            this.n = n;
            this.hd = hd;
        }
        
    }
    public int[][] verticalOrderTraversal(TreeNode A) {
        TreeMap<Integer,ArrayList<Integer>> hm = new TreeMap<>();
        Queue<QNode> q = new LinkedList<>();
        q.add(new QNode(A,0));
        
        while(!q.isEmpty()){
            QNode qn = q.poll();
            int val = qn.hd;
            if(qn != null && qn.n != null){
                if(hm.containsKey(val)){
                    ArrayList<Integer> aa = hm.get(val);
                    aa.add(qn.n.val);
                    hm.put(val,aa);
                }else{
                    ArrayList<Integer> aa = new ArrayList<>();
                    aa.add(qn.n.val);
                    hm.put(val, aa);
                }
                
                if(qn.n.left != null && qn.n.left.val != -1){
                    q.add(new QNode(qn.n.left, val-1));    
                }
                
                if(qn.n.right != null && qn.n.right.val != -1){
                    q.add(new QNode(qn.n.right, val+1));
                }
            }
        }
        
        
        int row = hm.size();
        int col = 1;
        for(int key: hm.keySet()){
            ArrayList aa = hm.get(key);
            if(aa != null)
                col = Math.max(col, aa.size());
        }
        int[][] sol = new int[row][col];
        int i=0;
        for(int key: hm.keySet()){
            ArrayList<Integer> aa = hm.get(key);
            int[] abc = new int[aa.size()];
            int j = 0;
            for(int ele: aa){
                abc[j] = ele;
                j++;
            }
            sol[i] = abc;

            i++;
        }
        return sol;
    }
}
